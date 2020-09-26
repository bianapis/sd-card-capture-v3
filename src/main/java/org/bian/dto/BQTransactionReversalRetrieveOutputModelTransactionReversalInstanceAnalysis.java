package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionReversalRetrieveOutputModelTransactionReversalInstanceAnalysis
 */
public class BQTransactionReversalRetrieveOutputModelTransactionReversalInstanceAnalysis   {
  private Object transactionReversalInstanceAnalysisRecord = null;

  private String transactionReversalInstanceAnalysisReportType = null;

  private String transactionReversalInstanceAnalysisParameters = null;

  private Object transactionReversalInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionReversalInstanceAnalysisRecord
  **/

  public Object getTransactionReversalInstanceAnalysisRecord() {
    return transactionReversalInstanceAnalysisRecord;
  }

  public void setTransactionReversalInstanceAnalysisRecord(Object transactionReversalInstanceAnalysisRecord) {
    this.transactionReversalInstanceAnalysisRecord = transactionReversalInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionReversalInstanceAnalysisReportType
  **/

  public String getTransactionReversalInstanceAnalysisReportType() {
    return transactionReversalInstanceAnalysisReportType;
  }

  public void setTransactionReversalInstanceAnalysisReportType(String transactionReversalInstanceAnalysisReportType) {
    this.transactionReversalInstanceAnalysisReportType = transactionReversalInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionReversalInstanceAnalysisParameters
  **/

  public String getTransactionReversalInstanceAnalysisParameters() {
    return transactionReversalInstanceAnalysisParameters;
  }

  public void setTransactionReversalInstanceAnalysisParameters(String transactionReversalInstanceAnalysisParameters) {
    this.transactionReversalInstanceAnalysisParameters = transactionReversalInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return transactionReversalInstanceAnalysisReport
  **/

  public Object getTransactionReversalInstanceAnalysisReport() {
    return transactionReversalInstanceAnalysisReport;
  }

  public void setTransactionReversalInstanceAnalysisReport(Object transactionReversalInstanceAnalysisReport) {
    this.transactionReversalInstanceAnalysisReport = transactionReversalInstanceAnalysisReport;
  }


}

