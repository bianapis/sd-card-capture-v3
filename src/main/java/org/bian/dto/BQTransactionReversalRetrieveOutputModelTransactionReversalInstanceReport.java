package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionReversalRetrieveOutputModelTransactionReversalInstanceReport
 */
public class BQTransactionReversalRetrieveOutputModelTransactionReversalInstanceReport   {
  private Object transactionReversalInstanceReportRecord = null;

  private String transactionReversalInstanceReportType = null;

  private String transactionReversalInstanceReportParameters = null;

  private Object transactionReversalInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionReversalInstanceReportRecord
  **/

  public Object getTransactionReversalInstanceReportRecord() {
    return transactionReversalInstanceReportRecord;
  }

  public void setTransactionReversalInstanceReportRecord(Object transactionReversalInstanceReportRecord) {
    this.transactionReversalInstanceReportRecord = transactionReversalInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionReversalInstanceReportType
  **/

  public String getTransactionReversalInstanceReportType() {
    return transactionReversalInstanceReportType;
  }

  public void setTransactionReversalInstanceReportType(String transactionReversalInstanceReportType) {
    this.transactionReversalInstanceReportType = transactionReversalInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionReversalInstanceReportParameters
  **/

  public String getTransactionReversalInstanceReportParameters() {
    return transactionReversalInstanceReportParameters;
  }

  public void setTransactionReversalInstanceReportParameters(String transactionReversalInstanceReportParameters) {
    this.transactionReversalInstanceReportParameters = transactionReversalInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionReversalInstanceReport
  **/

  public Object getTransactionReversalInstanceReport() {
    return transactionReversalInstanceReport;
  }

  public void setTransactionReversalInstanceReport(Object transactionReversalInstanceReport) {
    this.transactionReversalInstanceReport = transactionReversalInstanceReport;
  }


}

