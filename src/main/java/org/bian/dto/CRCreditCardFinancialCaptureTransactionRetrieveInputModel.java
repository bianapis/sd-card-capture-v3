package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceAnalysis;
import org.bian.dto.CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionRetrieveInputModel
 */
public class CRCreditCardFinancialCaptureTransactionRetrieveInputModel   {
  private Object creditCardFinancialCaptureTransactionRetrieveActionTaskRecord = null;

  private String creditCardFinancialCaptureTransactionRetrieveActionRequest = null;

  private CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceReportRecord creditCardFinancialCaptureTransactionInstanceReportRecord = null;

  private CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceAnalysis creditCardFinancialCaptureTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditCardFinancialCaptureTransactionRetrieveActionTaskRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionRetrieveActionTaskRecord() {
    return creditCardFinancialCaptureTransactionRetrieveActionTaskRecord;
  }

  public void setCreditCardFinancialCaptureTransactionRetrieveActionTaskRecord(Object creditCardFinancialCaptureTransactionRetrieveActionTaskRecord) {
    this.creditCardFinancialCaptureTransactionRetrieveActionTaskRecord = creditCardFinancialCaptureTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditCardFinancialCaptureTransactionRetrieveActionRequest
  **/

  public String getCreditCardFinancialCaptureTransactionRetrieveActionRequest() {
    return creditCardFinancialCaptureTransactionRetrieveActionRequest;
  }

  public void setCreditCardFinancialCaptureTransactionRetrieveActionRequest(String creditCardFinancialCaptureTransactionRetrieveActionRequest) {
    this.creditCardFinancialCaptureTransactionRetrieveActionRequest = creditCardFinancialCaptureTransactionRetrieveActionRequest;
  }


  /**
   * Get creditCardFinancialCaptureTransactionInstanceReportRecord
   * @return creditCardFinancialCaptureTransactionInstanceReportRecord
  **/

  public CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceReportRecord getCreditCardFinancialCaptureTransactionInstanceReportRecord() {
    return creditCardFinancialCaptureTransactionInstanceReportRecord;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReportRecord(CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceReportRecord creditCardFinancialCaptureTransactionInstanceReportRecord) {
    this.creditCardFinancialCaptureTransactionInstanceReportRecord = creditCardFinancialCaptureTransactionInstanceReportRecord;
  }


  /**
   * Get creditCardFinancialCaptureTransactionInstanceAnalysis
   * @return creditCardFinancialCaptureTransactionInstanceAnalysis
  **/

  public CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceAnalysis getCreditCardFinancialCaptureTransactionInstanceAnalysis() {
    return creditCardFinancialCaptureTransactionInstanceAnalysis;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceAnalysis(CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceAnalysis creditCardFinancialCaptureTransactionInstanceAnalysis) {
    this.creditCardFinancialCaptureTransactionInstanceAnalysis = creditCardFinancialCaptureTransactionInstanceAnalysis;
  }


}

