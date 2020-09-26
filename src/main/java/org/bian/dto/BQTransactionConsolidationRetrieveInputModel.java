package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceAnalysis;
import org.bian.dto.BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionConsolidationRetrieveInputModel
 */
public class BQTransactionConsolidationRetrieveInputModel   {
  private Object transactionConsolidationRetrieveActionTaskRecord = null;

  private String transactionConsolidationRetrieveActionRequest = null;

  private BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceReport transactionConsolidationInstanceReport = null;

  private BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceAnalysis transactionConsolidationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionConsolidationRetrieveActionTaskRecord
  **/

  public Object getTransactionConsolidationRetrieveActionTaskRecord() {
    return transactionConsolidationRetrieveActionTaskRecord;
  }

  public void setTransactionConsolidationRetrieveActionTaskRecord(Object transactionConsolidationRetrieveActionTaskRecord) {
    this.transactionConsolidationRetrieveActionTaskRecord = transactionConsolidationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionConsolidationRetrieveActionRequest
  **/

  public String getTransactionConsolidationRetrieveActionRequest() {
    return transactionConsolidationRetrieveActionRequest;
  }

  public void setTransactionConsolidationRetrieveActionRequest(String transactionConsolidationRetrieveActionRequest) {
    this.transactionConsolidationRetrieveActionRequest = transactionConsolidationRetrieveActionRequest;
  }


  /**
   * Get transactionConsolidationInstanceReport
   * @return transactionConsolidationInstanceReport
  **/

  public BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceReport getTransactionConsolidationInstanceReport() {
    return transactionConsolidationInstanceReport;
  }

  public void setTransactionConsolidationInstanceReport(BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceReport transactionConsolidationInstanceReport) {
    this.transactionConsolidationInstanceReport = transactionConsolidationInstanceReport;
  }


  /**
   * Get transactionConsolidationInstanceAnalysis
   * @return transactionConsolidationInstanceAnalysis
  **/

  public BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceAnalysis getTransactionConsolidationInstanceAnalysis() {
    return transactionConsolidationInstanceAnalysis;
  }

  public void setTransactionConsolidationInstanceAnalysis(BQTransactionConsolidationRetrieveInputModelTransactionConsolidationInstanceAnalysis transactionConsolidationInstanceAnalysis) {
    this.transactionConsolidationInstanceAnalysis = transactionConsolidationInstanceAnalysis;
  }


}

