/**
 * 
 */
package com.mycomp.service;

// TODO: Auto-generated Javadoc
/**
 * The Class SQLService.
 * 
 * @author Dinakaran Jayaraman
 */
public class SQLService implements LibService {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The rpt node def sql. */
	private String rptNodeDefSql;

	/** The class id sql. */
	private String classIdSql;

	/** The object id sql. */
	private String objectIdSql;

	/** The property data sql. */
	private String propertyDataSql;

	/** The object list sql. */
	private String objectListSql;

	/** The insert rpt node def sql. */
	private String insertRptNodeDefSql;

	/** The max sibling no rpt node def sql. */
	private String maxSiblingNoRptNodeDefSql;

	/** The merge gaa rpt data sql. */
	private String mergeGaaRptDataSql;

	/** The update gaa rpt data sql. */
	private String updateGaaRptDataSql;

	/** The delete gaa rpt data sql. */
	private String deleteGaaRptDataSql;

	/** The merge gaa rpt sql. */
	private String mergeGaaRptSql;

	/** The reports list sql. */
	private String reportsListSql;

	/** The report id sql. */
	private String reportIdSql;

	/** The valid account sql. */
	private String validAccountSql;

	/** The valid accounts sql. */
	private String validAccountsSql;

	/** The node code from list data sql. */
	private String nodeCodeFromListDataSql;

	/** The select map data sql. */
	private String selectMapDataSql;

	/** The update map data sql. */
	private String updateMapDataSql;

	/** The object id from desc sql. */
	private String objectIdFromDescSql;

	/** The valid acct by obj id sql. */
	private String validAcctByObjIdSql;

	/** The report freq sql. */
	private String reportFreqSql;

	/** The insert gaa queue sql. */
	private String insertGaaQueueSql;

	/** The report freq for an account sql. */
	private String reportFreqForAnAccountSql;

	/** The update gaa queue status sql. */
	private String updateGaaQueueStatusSql;

	/** The submitted queue sql. */
	private String submittedQueueSql;

	/** The update queue to dup sql. */
	private String updateQueueToDupSql;

	/** The candidate rpt non yearly sql. */
	private String candidateRptNonYearlySql;

	/** The candidate rpt weekly sql. */
	private String candidateRptWeeklySql;

	/** The candidate rpt monthly sql. */
	private String candidateRptMonthlySql;

	/** The candidate rpt yearly reuse sql. */
	private String candidateRptYearlyReuseSql;

	/** The update queue to active sql. */
	private String updateQueueToActiveSql;

	/** The update queue to processed sql. */
	private String updateQueueToProcessedSql;

	/** The custom reports list sql. */
	private String customReportsListSql;

	/** The insert gaa rpt cust sql. */
	private String insertGaaRptCustSql;

	/** The insert gaa rpt data cust sql. */
	private String insertGaaRptDataCustSql;

	/** The custom report id sql. */
	private String customReportIdSql;

	/** The insert gaa queue error sql. */
	private String insertGaaQueueErrorSql;

	/** The last x days sql. */
	private String lastXDaysSql;

	/** The candidate rpt daily sql. */
	private String candidateRptDailySql;
	
	/**
	 * Gets the candidate rpt daily sql.
	 *
	 * @return the candidate rpt daily sql
	 */
	public String getCandidateRptDailySql() {
		return candidateRptDailySql;
	}

	/**
	 * Sets the candidate rpt daily sql.
	 *
	 * @param candidateRptDailySql the new candidate rpt daily sql
	 */
	public void setCandidateRptDailySql(String candidateRptDailySql) {
		this.candidateRptDailySql = candidateRptDailySql;
	}

	/**
	 * Gets the last x days sql.
	 * 
	 * @return the last x days sql
	 */
	public String getLastXDaysSql() {
		return lastXDaysSql;
	}

	/**
	 * Sets the last x days sql.
	 * 
	 * @param lastXDaysSql
	 *            the new last x days sql
	 */
	public void setLastXDaysSql(String lastXDaysSql) {
		this.lastXDaysSql = lastXDaysSql;
	}

	/**
	 * Gets the insert gaa queue error sql.
	 * 
	 * @return the insert gaa queue error sql
	 */
	public String getInsertGaaQueueErrorSql() {
		return insertGaaQueueErrorSql;
	}

	/**
	 * Sets the insert gaa queue error sql.
	 * 
	 * @param insertGaaQueueErrorSql
	 *            the new insert gaa queue error sql
	 */
	public void setInsertGaaQueueErrorSql(String insertGaaQueueErrorSql) {
		this.insertGaaQueueErrorSql = insertGaaQueueErrorSql;
	}

	/**
	 * Gets the custom report id sql.
	 * 
	 * @return the customReportIdSql
	 */
	public String getCustomReportIdSql() {
		return customReportIdSql;
	}

	/**
	 * Sets the custom report id sql.
	 * 
	 * @param customReportIdSql
	 *            the customReportIdSql to set
	 */
	public void setCustomReportIdSql(String customReportIdSql) {
		this.customReportIdSql = customReportIdSql;
	}

	/**
	 * Gets the insert gaa rpt cust sql.
	 * 
	 * @return the insertGaaRptCustSql
	 */
	public String getInsertGaaRptCustSql() {
		return insertGaaRptCustSql;
	}

	/**
	 * Sets the insert gaa rpt cust sql.
	 * 
	 * @param insertGaaRptCustSql
	 *            the insertGaaRptCustSql to set
	 */
	public void setInsertGaaRptCustSql(String insertGaaRptCustSql) {
		this.insertGaaRptCustSql = insertGaaRptCustSql;
	}

	/**
	 * Gets the insert gaa rpt data cust sql.
	 * 
	 * @return the insertGaaRptDataCustSql
	 */
	public String getInsertGaaRptDataCustSql() {
		return insertGaaRptDataCustSql;
	}

	/**
	 * Sets the insert gaa rpt data cust sql.
	 * 
	 * @param insertGaaRptDataCustSql
	 *            the insertGaaRptDataCustSql to set
	 */
	public void setInsertGaaRptDataCustSql(String insertGaaRptDataCustSql) {
		this.insertGaaRptDataCustSql = insertGaaRptDataCustSql;
	}

	/**
	 * Gets the custom reports list sql.
	 * 
	 * @return the customReportsListSql
	 */
	public String getCustomReportsListSql() {
		return customReportsListSql;
	}

	/**
	 * Sets the custom reports list sql.
	 * 
	 * @param customReportsListSql
	 *            the customReportsListSql to set
	 */
	public void setCustomReportsListSql(String customReportsListSql) {
		this.customReportsListSql = customReportsListSql;
	}

	/**
	 * Gets the update queue to active sql.
	 * 
	 * @return the updateQueueToActiveSql
	 */
	public String getUpdateQueueToActiveSql() {
		return updateQueueToActiveSql;
	}

	/**
	 * Sets the update queue to active sql.
	 * 
	 * @param updateQueueToActiveSql
	 *            the updateQueueToActiveSql to set
	 */
	public void setUpdateQueueToActiveSql(String updateQueueToActiveSql) {
		this.updateQueueToActiveSql = updateQueueToActiveSql;
	}

	/**
	 * Gets the update queue to processed sql.
	 * 
	 * @return the updateQueueToProcessedSql
	 */
	public String getUpdateQueueToProcessedSql() {
		return updateQueueToProcessedSql;
	}

	/**
	 * Sets the update queue to processed sql.
	 * 
	 * @param updateQueueToProcessedSql
	 *            the updateQueueToProcessedSql to set
	 */
	public void setUpdateQueueToProcessedSql(String updateQueueToProcessedSql) {
		this.updateQueueToProcessedSql = updateQueueToProcessedSql;
	}

	/**
	 * Gets the candidate rpt yearly reuse sql.
	 * 
	 * @return the candidateRptYearlyReuseSql
	 */
	public String getCandidateRptYearlyReuseSql() {
		return candidateRptYearlyReuseSql;
	}

	/**
	 * Sets the candidate rpt yearly reuse sql.
	 * 
	 * @param candidateRptYearlyReuseSql
	 *            the candidateRptYearlyReuseSql to set
	 */
	public void setCandidateRptYearlyReuseSql(String candidateRptYearlyReuseSql) {
		this.candidateRptYearlyReuseSql = candidateRptYearlyReuseSql;
	}

	/**
	 * Gets the candidate rpt monthly sql.
	 * 
	 * @return the candidateRptMonthlySql
	 */
	public String getCandidateRptMonthlySql() {
		return candidateRptMonthlySql;
	}

	/**
	 * Sets the candidate rpt monthly sql.
	 * 
	 * @param candidateRptMonthlySql
	 *            the candidateRptMonthlySql to set
	 */
	public void setCandidateRptMonthlySql(String candidateRptMonthlySql) {
		this.candidateRptMonthlySql = candidateRptMonthlySql;
	}

	/**
	 * Gets the candidate rpt weekly sql.
	 * 
	 * @return the candidateRptWeeklySql
	 */
	public String getCandidateRptWeeklySql() {
		return candidateRptWeeklySql;
	}

	/**
	 * Sets the candidate rpt weekly sql.
	 * 
	 * @param candidateRptWeeklySql
	 *            the candidateRptWeeklySql to set
	 */
	public void setCandidateRptWeeklySql(String candidateRptWeeklySql) {
		this.candidateRptWeeklySql = candidateRptWeeklySql;
	}

	/**
	 * Gets the candidate rpt non yearly sql.
	 * 
	 * @return the candidateRptNonYearlySql
	 */
	public String getCandidateRptNonYearlySql() {
		return candidateRptNonYearlySql;
	}

	/**
	 * Sets the candidate rpt non yearly sql.
	 * 
	 * @param candidateRptNonYearlySql
	 *            the candidateRptNonYearlySql to set
	 */
	public void setCandidateRptNonYearlySql(String candidateRptNonYearlySql) {
		this.candidateRptNonYearlySql = candidateRptNonYearlySql;
	}

	/**
	 * Gets the candidate rpt yearly sql.
	 * 
	 * @return the candidateRptYearlySql
	 */
	public String getCandidateRptYearlySql() {
		return candidateRptYearlySql;
	}

	/**
	 * Sets the candidate rpt yearly sql.
	 * 
	 * @param candidateRptYearlySql
	 *            the candidateRptYearlySql to set
	 */
	public void setCandidateRptYearlySql(String candidateRptYearlySql) {
		this.candidateRptYearlySql = candidateRptYearlySql;
	}

	/** The candidate rpt yearly sql. */
	private String candidateRptYearlySql;

	/**
	 * Gets the submitted queue sql.
	 * 
	 * @return the submittedQueueSql
	 */
	public String getSubmittedQueueSql() {
		return submittedQueueSql;
	}

	/**
	 * Sets the submitted queue sql.
	 * 
	 * @param submittedQueueSql
	 *            the submittedQueueSql to set
	 */
	public void setSubmittedQueueSql(String submittedQueueSql) {
		this.submittedQueueSql = submittedQueueSql;
	}

	/**
	 * Gets the update queue to dup sql.
	 * 
	 * @return the updateQueueToDupSql
	 */
	public String getUpdateQueueToDupSql() {
		return updateQueueToDupSql;
	}

	/**
	 * Sets the update queue to dup sql.
	 * 
	 * @param updateQueueToDupSql
	 *            the updateQueueToDupSql to set
	 */
	public void setUpdateQueueToDupSql(String updateQueueToDupSql) {
		this.updateQueueToDupSql = updateQueueToDupSql;
	}

	/**
	 * Gets the update gaa queue status sql.
	 * 
	 * @return the updateGaaQueueStatusSql
	 */
	public String getUpdateGaaQueueStatusSql() {
		return updateGaaQueueStatusSql;
	}

	/**
	 * Sets the update gaa queue status sql.
	 * 
	 * @param updateGaaQueueStatusSql
	 *            the updateGaaQueueStatusSql to set
	 */
	public void setUpdateGaaQueueStatusSql(String updateGaaQueueStatusSql) {
		this.updateGaaQueueStatusSql = updateGaaQueueStatusSql;
	}

	/**
	 * Gets the report freq for an account sql.
	 * 
	 * @return the reportFreqForAnAccountSql
	 */
	public String getReportFreqForAnAccountSql() {
		return reportFreqForAnAccountSql;
	}

	/**
	 * Sets the report freq for an account sql.
	 * 
	 * @param reportFreqForAnAccountSql
	 *            the reportFreqForAnAccountSql to set
	 */
	public void setReportFreqForAnAccountSql(String reportFreqForAnAccountSql) {
		this.reportFreqForAnAccountSql = reportFreqForAnAccountSql;
	}

	/**
	 * Gets the insert gaa queue sql.
	 * 
	 * @return the insertGaaQueueSql
	 */
	public String getInsertGaaQueueSql() {
		return insertGaaQueueSql;
	}

	/**
	 * Sets the insert gaa queue sql.
	 * 
	 * @param insertGaaQueueSql
	 *            the insertGaaQueueSql to set
	 */
	public void setInsertGaaQueueSql(String insertGaaQueueSql) {
		this.insertGaaQueueSql = insertGaaQueueSql;
	}

	/**
	 * Gets the report freq sql.
	 * 
	 * @return the reportFreqSql
	 */
	public String getReportFreqSql() {
		return reportFreqSql;
	}

	/**
	 * Sets the report freq sql.
	 * 
	 * @param reportFreqSql
	 *            the reportFreqSql to set
	 */
	public void setReportFreqSql(String reportFreqSql) {
		this.reportFreqSql = reportFreqSql;
	}

	/**
	 * Gets the valid acct by obj id sql.
	 * 
	 * @return the validAcctByObjIdSql
	 */
	public String getValidAcctByObjIdSql() {
		return validAcctByObjIdSql;
	}

	/**
	 * Sets the valid acct by obj id sql.
	 * 
	 * @param validAcctByObjIdSql
	 *            the validAcctByObjIdSql to set
	 */
	public void setValidAcctByObjIdSql(String validAcctByObjIdSql) {
		this.validAcctByObjIdSql = validAcctByObjIdSql;
	}

	/**
	 * Gets the object id from desc sql.
	 * 
	 * @return the objectIdFromDescSql
	 */
	public String getObjectIdFromDescSql() {
		return objectIdFromDescSql;
	}

	/**
	 * Sets the object id from desc sql.
	 * 
	 * @param objectIdFromDescSql
	 *            the objectIdFromDescSql to set
	 */
	public void setObjectIdFromDescSql(String objectIdFromDescSql) {
		this.objectIdFromDescSql = objectIdFromDescSql;
	}

	/**
	 * Gets the select map data sql.
	 * 
	 * @return the selectMapDataSql
	 */
	public String getSelectMapDataSql() {
		return selectMapDataSql;
	}

	/**
	 * Sets the select map data sql.
	 * 
	 * @param selectMapDataSql
	 *            the selectMapDataSql to set
	 */
	public void setSelectMapDataSql(String selectMapDataSql) {
		this.selectMapDataSql = selectMapDataSql;
	}

	/**
	 * Gets the update map data sql.
	 * 
	 * @return the updateMapDataSql
	 */
	public String getUpdateMapDataSql() {
		return updateMapDataSql;
	}

	/**
	 * Sets the update map data sql.
	 * 
	 * @param updateMapDataSql
	 *            the updateMapDataSql to set
	 */
	public void setUpdateMapDataSql(String updateMapDataSql) {
		this.updateMapDataSql = updateMapDataSql;
	}

	/**
	 * Gets the node code from list data sql.
	 * 
	 * @return the nodeCodeFromListDataSql
	 */
	public String getNodeCodeFromListDataSql() {
		return nodeCodeFromListDataSql;
	}

	/**
	 * Sets the node code from list data sql.
	 * 
	 * @param nodeCodeFromListDataSql
	 *            the nodeCodeFromListDataSql to set
	 */
	public void setNodeCodeFromListDataSql(String nodeCodeFromListDataSql) {
		this.nodeCodeFromListDataSql = nodeCodeFromListDataSql;
	}

	/**
	 * Gets the reports list sql.
	 * 
	 * @return the reportsListSql
	 */
	public String getReportsListSql() {
		return reportsListSql;
	}

	/**
	 * Sets the reports list sql.
	 * 
	 * @param reportsListSql
	 *            the reportsListSql to set
	 */
	public void setReportsListSql(String reportsListSql) {
		this.reportsListSql = reportsListSql;
	}

	/**
	 * Gets the report id sql.
	 * 
	 * @return the reportIdSql
	 */
	public String getReportIdSql() {
		return reportIdSql;
	}

	/**
	 * Sets the report id sql.
	 * 
	 * @param reportIdSql
	 *            the reportIdSql to set
	 */
	public void setReportIdSql(String reportIdSql) {
		this.reportIdSql = reportIdSql;
	}

	/**
	 * Gets the valid account sql.
	 * 
	 * @return the validAccountSql
	 */
	public String getValidAccountSql() {
		return validAccountSql;
	}

	/**
	 * Sets the valid account sql.
	 * 
	 * @param validAccountSql
	 *            the validAccountSql to set
	 */
	public void setValidAccountSql(String validAccountSql) {
		this.validAccountSql = validAccountSql;
	}

	/**
	 * Gets the valid accounts sql.
	 * 
	 * @return the validAccountsSql
	 */
	public String getValidAccountsSql() {
		return validAccountsSql;
	}

	/**
	 * Sets the valid accounts sql.
	 * 
	 * @param validAccountsSql
	 *            the validAccountsSql to set
	 */
	public void setValidAccountsSql(String validAccountsSql) {
		this.validAccountsSql = validAccountsSql;
	}

	/**
	 * Gets the rpt node def sql.
	 * 
	 * @return the rptNodeDefSql
	 */
	public String getRptNodeDefSql() {
		return rptNodeDefSql;
	}

	/**
	 * Sets the rpt node def sql.
	 * 
	 * @param rptNodeDefSql
	 *            the rptNodeDefSql to set
	 */
	public void setRptNodeDefSql(String rptNodeDefSql) {
		this.rptNodeDefSql = rptNodeDefSql;
	}

	/**
	 * Gets the class id sql.
	 * 
	 * @return the classIdSql
	 */
	public String getClassIdSql() {
		return classIdSql;
	}

	/**
	 * Sets the class id sql.
	 * 
	 * @param classIdSql
	 *            the classIdSql to set
	 */
	public void setClassIdSql(String classIdSql) {
		this.classIdSql = classIdSql;
	}

	/**
	 * Gets the object id sql.
	 * 
	 * @return the objectIdSql
	 */
	public String getObjectIdSql() {
		return objectIdSql;
	}

	/**
	 * Sets the object id sql.
	 * 
	 * @param objectIdSql
	 *            the objectIdSql to set
	 */
	public void setObjectIdSql(String objectIdSql) {
		this.objectIdSql = objectIdSql;
	}

	/**
	 * Gets the property data sql.
	 * 
	 * @return the propertyDataSql
	 */
	public String getPropertyDataSql() {
		return propertyDataSql;
	}

	/**
	 * Sets the property data sql.
	 * 
	 * @param propertyDataSql
	 *            the propertyDataSql to set
	 */
	public void setPropertyDataSql(String propertyDataSql) {
		this.propertyDataSql = propertyDataSql;
	}

	/**
	 * Gets the object list sql.
	 * 
	 * @return the objectListSql
	 */
	public String getObjectListSql() {
		return objectListSql;
	}

	/**
	 * Sets the object list sql.
	 * 
	 * @param objectListSql
	 *            the objectListSql to set
	 */
	public void setObjectListSql(String objectListSql) {
		this.objectListSql = objectListSql;
	}

	/**
	 * Gets the insert rpt node def sql.
	 * 
	 * @return the insertRptNodeDefSql
	 */
	public String getInsertRptNodeDefSql() {
		return insertRptNodeDefSql;
	}

	/**
	 * Sets the insert rpt node def sql.
	 * 
	 * @param insertRptNodeDefSql
	 *            the insertRptNodeDefSql to set
	 */
	public void setInsertRptNodeDefSql(String insertRptNodeDefSql) {
		this.insertRptNodeDefSql = insertRptNodeDefSql;
	}

	/**
	 * Gets the max sibling no rpt node def sql.
	 * 
	 * @return the maxSiblingNoRptNodeDefSql
	 */
	public String getMaxSiblingNoRptNodeDefSql() {
		return maxSiblingNoRptNodeDefSql;
	}

	/**
	 * Sets the max sibling no rpt node def sql.
	 * 
	 * @param maxSiblingNoRptNodeDefSql
	 *            the maxSiblingNoRptNodeDefSql to set
	 */
	public void setMaxSiblingNoRptNodeDefSql(String maxSiblingNoRptNodeDefSql) {
		this.maxSiblingNoRptNodeDefSql = maxSiblingNoRptNodeDefSql;
	}

	/**
	 * Gets the merge gaa rpt data sql.
	 * 
	 * @return the mergeGaaRptDataSql
	 */
	public String getMergeGaaRptDataSql() {
		return mergeGaaRptDataSql;
	}

	/**
	 * Sets the merge gaa rpt data sql.
	 * 
	 * @param mergeGaaRptDataSql
	 *            the mergeGaaRptDataSql to set
	 */
	public void setMergeGaaRptDataSql(String mergeGaaRptDataSql) {
		this.mergeGaaRptDataSql = mergeGaaRptDataSql;
	}

	/**
	 * Gets the update gaa rpt data sql.
	 * 
	 * @return the updateGaaRptDataSql
	 */
	public String getUpdateGaaRptDataSql() {
		return updateGaaRptDataSql;
	}

	/**
	 * Sets the update gaa rpt data sql.
	 * 
	 * @param updateGaaRptDataSql
	 *            the updateGaaRptDataSql to set
	 */
	public void setUpdateGaaRptDataSql(String updateGaaRptDataSql) {
		this.updateGaaRptDataSql = updateGaaRptDataSql;
	}

	/**
	 * Gets the delete gaa rpt data sql.
	 * 
	 * @return the deleteGaaRptDataSql
	 */
	public String getDeleteGaaRptDataSql() {
		return deleteGaaRptDataSql;
	}

	/**
	 * Sets the delete gaa rpt data sql.
	 * 
	 * @param deleteGaaRptDataSql
	 *            the deleteGaaRptDataSql to set
	 */
	public void setDeleteGaaRptDataSql(String deleteGaaRptDataSql) {
		this.deleteGaaRptDataSql = deleteGaaRptDataSql;
	}

	/**
	 * Gets the merge gaa rpt sql.
	 * 
	 * @return the mergeGaaRptSql
	 */
	public String getMergeGaaRptSql() {
		return mergeGaaRptSql;
	}

	/**
	 * Sets the merge gaa rpt sql.
	 * 
	 * @param mergeGaaRptSql
	 *            the mergeGaaRptSql to set
	 */
	public void setMergeGaaRptSql(String mergeGaaRptSql) {
		this.mergeGaaRptSql = mergeGaaRptSql;
	}
}
