/**
 * 
 */
package com.mycomp.utils;

/**
 * @author Dinakaran Jayaraman
 *
 */

import java.io.IOException;
import java.util.Properties;

import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.springframework.context.SmartLifecycle;

public class HSqlServer implements SmartLifecycle {
	private static final AppLogger LOGGER = AppLogger
			.getLogger(HSqlServer.class);
	private HsqlProperties properties;
	private Server server;
	private boolean running = false;

	public HSqlServer(Properties props) {
		properties = new HsqlProperties(props);
	}

	@Override
	public boolean isRunning() {
		if (server != null)
			server.checkRunning(running);
		return running;
	}

	@Override
	public void start() {
		if (server == null) {
			LOGGER.info("Starting HSQL server...");
			server = new Server();
			try {
				server.setProperties(properties);
				server.start();
				running = true;
			} catch (AclFormatException afe) {
				LOGGER.error("Error starting HSQL server.", afe);
			} catch (IOException e) {
				LOGGER.error("Error starting HSQL server.", e);
			}
		}
	}

	@Override
	public void stop() {
		LOGGER.info("Stopping HSQL server...");
		if (server != null) {
			server.stop();
			running = false;
		}
	}

	@Override
	public int getPhase() {
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable runnable) {
		stop();
		runnable.run();
	}
}