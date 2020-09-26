package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionReversalRetrieveInputModelTransactionReversalInstanceAnalysis;
import org.bian.dto.BQTransactionReversalRetrieveInputModelTransactionReversalInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionReversalRetrieveInputModel
 */
public class BQTransactionReversalRetrieveInputModel   {
  private Object transactionReversalRetrieveActionTaskRecord = null;

  private String transactionReversalRetrieveActionRequest = null;

  private BQTransactionReversalRetrieveInputModelTransactionReversalInstanceReport transactionReversalInstanceReport = null;

  private BQTransactionReversalRetrieveInputModelTransactionReversalInstanceAnalysis transactionReversalInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionReversalRetrieveActionTaskRecord
  **/

  public Object getTransactionReversalRetrieveActionTaskRecord() {
    return transactionReversalRetrieveActionTaskRecord;
  }

  public void setTransactionReversalRetrieveActionTaskRecord(Object transactionReversalRetrieveActionTaskRecord) {
    this.transactionReversalRetrieveActionTaskRecord = transactionReversalRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionReversalRetrieveActionRequest
  **/

  public String getTransactionReversalRetrieveActionRequest() {
    return transactionReversalRetrieveActionRequest;
  }

  public void setTransactionReversalRetrieveActionRequest(String transactionReversalRetrieveActionRequest) {
    this.transactionReversalRetrieveActionRequest = transactionReversalRetrieveActionRequest;
  }


  /**
   * Get transactionReversalInstanceReport
   * @return transactionReversalInstanceReport
  **/

  public BQTransactionReversalRetrieveInputModelTransactionReversalInstanceReport getTransactionReversalInstanceReport() {
    return transactionReversalInstanceReport;
  }

  public void setTransactionReversalInstanceReport(BQTransactionReversalRetrieveInputModelTransactionReversalInstanceReport transactionReversalInstanceReport) {
    this.transactionReversalInstanceReport = transactionReversalInstanceReport;
  }


  /**
   * Get transactionReversalInstanceAnalysis
   * @return transactionReversalInstanceAnalysis
  **/

  public BQTransactionReversalRetrieveInputModelTransactionReversalInstanceAnalysis getTransactionReversalInstanceAnalysis() {
    return transactionReversalInstanceAnalysis;
  }

  public void setTransactionReversalInstanceAnalysis(BQTransactionReversalRetrieveInputModelTransactionReversalInstanceAnalysis transactionReversalInstanceAnalysis) {
    this.transactionReversalInstanceAnalysis = transactionReversalInstanceAnalysis;
  }


}

