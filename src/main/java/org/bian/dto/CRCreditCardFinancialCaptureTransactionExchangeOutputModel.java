package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionExchangeOutputModel
 */
public class CRCreditCardFinancialCaptureTransactionExchangeOutputModel   {
  private String creditChargeCardFinancialCaptureTransactionParameterType = null;

  private String creditChargeCardFinancialCaptureTransactionSelectedOption = null;

  private String creditChargeCardFinancialCaptureTransactionStatus = null;

  private String creditCardFinancialCaptureTransactionExchangeActionTaskReference = null;

  private Object creditCardFinancialCaptureTransactionExchangeActionTaskRecord = null;

  private String creditCardFinancialCaptureTransactionExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Card Financial Capture Transaction instance exchange service call 
   * @return creditCardFinancialCaptureTransactionExchangeActionTaskReference
  **/

  public String getCreditCardFinancialCaptureTransactionExchangeActionTaskReference() {
    return creditCardFinancialCaptureTransactionExchangeActionTaskReference;
  }

  public void setCreditCardFinancialCaptureTransactionExchangeActionTaskReference(String creditCardFinancialCaptureTransactionExchangeActionTaskReference) {
    this.creditCardFinancialCaptureTransactionExchangeActionTaskReference = creditCardFinancialCaptureTransactionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return creditCardFinancialCaptureTransactionExchangeActionTaskRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionExchangeActionTaskRecord() {
    return creditCardFinancialCaptureTransactionExchangeActionTaskRecord;
  }

  public void setCreditCardFinancialCaptureTransactionExchangeActionTaskRecord(Object creditCardFinancialCaptureTransactionExchangeActionTaskRecord) {
    this.creditCardFinancialCaptureTransactionExchangeActionTaskRecord = creditCardFinancialCaptureTransactionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return creditCardFinancialCaptureTransactionExchangeActionResponse
  **/

  public String getCreditCardFinancialCaptureTransactionExchangeActionResponse() {
    return creditCardFinancialCaptureTransactionExchangeActionResponse;
  }

  public void setCreditCardFinancialCaptureTransactionExchangeActionResponse(String creditCardFinancialCaptureTransactionExchangeActionResponse) {
    this.creditCardFinancialCaptureTransactionExchangeActionResponse = creditCardFinancialCaptureTransactionExchangeActionResponse;
  }


}

