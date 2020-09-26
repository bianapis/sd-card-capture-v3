package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionConsolidationRetrieveOutputModelTransactionConsolidationInstanceReport
 */
public class BQTransactionConsolidationRetrieveOutputModelTransactionConsolidationInstanceReport   {
  private Object transactionConsolidationInstanceReportRecord = null;

  private String transactionConsolidationInstanceReportType = null;

  private String transactionConsolidationInstanceReportParameters = null;

  private Object transactionConsolidationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionConsolidationInstanceReportRecord
  **/

  public Object getTransactionConsolidationInstanceReportRecord() {
    return transactionConsolidationInstanceReportRecord;
  }

  public void setTransactionConsolidationInstanceReportRecord(Object transactionConsolidationInstanceReportRecord) {
    this.transactionConsolidationInstanceReportRecord = transactionConsolidationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionConsolidationInstanceReportType
  **/

  public String getTransactionConsolidationInstanceReportType() {
    return transactionConsolidationInstanceReportType;
  }

  public void setTransactionConsolidationInstanceReportType(String transactionConsolidationInstanceReportType) {
    this.transactionConsolidationInstanceReportType = transactionConsolidationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionConsolidationInstanceReportParameters
  **/

  public String getTransactionConsolidationInstanceReportParameters() {
    return transactionConsolidationInstanceReportParameters;
  }

  public void setTransactionConsolidationInstanceReportParameters(String transactionConsolidationInstanceReportParameters) {
    this.transactionConsolidationInstanceReportParameters = transactionConsolidationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionConsolidationInstanceReport
  **/

  public Object getTransactionConsolidationInstanceReport() {
    return transactionConsolidationInstanceReport;
  }

  public void setTransactionConsolidationInstanceReport(Object transactionConsolidationInstanceReport) {
    this.transactionConsolidationInstanceReport = transactionConsolidationInstanceReport;
  }


}

