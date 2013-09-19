/**
 * 
 */
package com.mycomp.utils;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @author Dinakaran Jayaraman
 *
 */
public final class CustomPropertyPlaceHolder extends
PropertyPlaceholderConfigurer {
/**
* Instantiates a new custom property place holder.
*/
public CustomPropertyPlaceHolder() {
super();
super.setProperties(LibProperties.props);
}

}
