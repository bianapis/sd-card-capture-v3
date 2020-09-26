package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionControlOutputModel
 */
public class CRCreditCardFinancialCaptureTransactionControlOutputModel   {
  private String creditChargeCardFinancialCaptureTransactionParameterType = null;

  private String creditChargeCardFinancialCaptureTransactionSelectedOption = null;

  private String creditChargeCardFinancialCaptureTransactionStatus = null;

  private String creditCardFinancialCaptureTransactionControlActionTaskReference = null;

  private Object creditCardFinancialCaptureTransactionControlActionTaskRecord = null;

  private String creditCardFinancialCaptureTransactionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between business sercice transaction within Credit/Charge Card Financial Capture Transaction 
   * @return creditChargeCardFinancialCaptureTransactionParameterType
  **/

  public String getCreditChargeCardFinancialCaptureTransactionParameterType() {
    return creditChargeCardFinancialCaptureTransactionParameterType;
  }

  public void setCreditChargeCardFinancialCaptureTransactionParameterType(String creditChargeCardFinancialCaptureTransactionParameterType) {
    this.creditChargeCardFinancialCaptureTransactionParameterType = creditChargeCardFinancialCaptureTransactionParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Credit/Charge Card Financial Capture Transaction 
   * @return creditChargeCardFinancialCaptureTransactionSelectedOption
  **/

  public String getCreditChargeCardFinancialCaptureTransactionSelectedOption() {
    return creditChargeCardFinancialCaptureTransactionSelectedOption;
  }

  public void setCreditChargeCardFinancialCaptureTransactionSelectedOption(String creditChargeCardFinancialCaptureTransactionSelectedOption) {
    this.creditChargeCardFinancialCaptureTransactionSelectedOption = creditChargeCardFinancialCaptureTransactionSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Credit/Charge Card Financial Capture Transaction 
   * @return creditChargeCardFinancialCaptureTransactionStatus
  **/

  public String getCreditChargeCardFinancialCaptureTransactionStatus() {
    return creditChargeCardFinancialCaptureTransactionStatus;
  }

  public void setCreditChargeCardFinancialCaptureTransactionStatus(String creditChargeCardFinancialCaptureTransactionStatus) {
    this.creditChargeCardFinancialCaptureTransactionStatus = creditChargeCardFinancialCaptureTransactionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Card Financial Capture Transaction instance control processing service call 
   * @return creditCardFinancialCaptureTransactionControlActionTaskReference
  **/

  public String getCreditCardFinancialCaptureTransactionControlActionTaskReference() {
    return creditCardFinancialCaptureTransactionControlActionTaskReference;
  }

  public void setCreditCardFinancialCaptureTransactionControlActionTaskReference(String creditCardFinancialCaptureTransactionControlActionTaskReference) {
    this.creditCardFinancialCaptureTransactionControlActionTaskReference = creditCardFinancialCaptureTransactionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return creditCardFinancialCaptureTransactionControlActionTaskRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionControlActionTaskRecord() {
    return creditCardFinancialCaptureTransactionControlActionTaskRecord;
  }

  public void setCreditCardFinancialCaptureTransactionControlActionTaskRecord(Object creditCardFinancialCaptureTransactionControlActionTaskRecord) {
    this.creditCardFinancialCaptureTransactionControlActionTaskRecord = creditCardFinancialCaptureTransactionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return creditCardFinancialCaptureTransactionControlActionResponse
  **/

  public String getCreditCardFinancialCaptureTransactionControlActionResponse() {
    return creditCardFinancialCaptureTransactionControlActionResponse;
  }

  public void setCreditCardFinancialCaptureTransactionControlActionResponse(String creditCardFinancialCaptureTransactionControlActionResponse) {
    this.creditCardFinancialCaptureTransactionControlActionResponse = creditCardFinancialCaptureTransactionControlActionResponse;
  }


}

