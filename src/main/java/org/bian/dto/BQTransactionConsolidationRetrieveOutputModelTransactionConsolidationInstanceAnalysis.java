package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionConsolidationRetrieveOutputModelTransactionConsolidationInstanceAnalysis
 */
public class BQTransactionConsolidationRetrieveOutputModelTransactionConsolidationInstanceAnalysis   {
  private Object transactionConsolidationInstanceAnalysisRecord = null;

  private String transactionConsolidationInstanceAnalysisReportType = null;

  private String transactionConsolidationInstanceAnalysisParameters = null;

  private Object transactionConsolidationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionConsolidationInstanceAnalysisRecord
  **/

  public Object getTransactionConsolidationInstanceAnalysisRecord() {
    return transactionConsolidationInstanceAnalysisRecord;
  }

  public void setTransactionConsolidationInstanceAnalysisRecord(Object transactionConsolidationInstanceAnalysisRecord) {
    this.transactionConsolidationInstanceAnalysisRecord = transactionConsolidationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionConsolidationInstanceAnalysisReportType
  **/

  public String getTransactionConsolidationInstanceAnalysisReportType() {
    return transactionConsolidationInstanceAnalysisReportType;
  }

  public void setTransactionConsolidationInstanceAnalysisReportType(String transactionConsolidationInstanceAnalysisReportType) {
    this.transactionConsolidationInstanceAnalysisReportType = transactionConsolidationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionConsolidationInstanceAnalysisParameters
  **/

  public String getTransactionConsolidationInstanceAnalysisParameters() {
    return transactionConsolidationInstanceAnalysisParameters;
  }

  public void setTransactionConsolidationInstanceAnalysisParameters(String transactionConsolidationInstanceAnalysisParameters) {
    this.transactionConsolidationInstanceAnalysisParameters = transactionConsolidationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return transactionConsolidationInstanceAnalysisReport
  **/

  public Object getTransactionConsolidationInstanceAnalysisReport() {
    return transactionConsolidationInstanceAnalysisReport;
  }

  public void setTransactionConsolidationInstanceAnalysisReport(Object transactionConsolidationInstanceAnalysisReport) {
    this.transactionConsolidationInstanceAnalysisReport = transactionConsolidationInstanceAnalysisReport;
  }


}

