package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionRequestOutputModel
 */
public class CRCreditCardFinancialCaptureTransactionRequestOutputModel   {
  private String creditChargeCardFinancialCaptureTransactionParameterType = null;

  private String creditChargeCardFinancialCaptureTransactionSelectedOption = null;

  private String creditChargeCardFinancialCaptureTransactionStatus = null;

  private String creditCardFinancialCaptureTransactionRequestActionTaskReference = null;

  private Object creditCardFinancialCaptureTransactionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Card Financial Capture Transaction instance request service call 
   * @return creditCardFinancialCaptureTransactionRequestActionTaskReference
  **/

  public String getCreditCardFinancialCaptureTransactionRequestActionTaskReference() {
    return creditCardFinancialCaptureTransactionRequestActionTaskReference;
  }

  public void setCreditCardFinancialCaptureTransactionRequestActionTaskReference(String creditCardFinancialCaptureTransactionRequestActionTaskReference) {
    this.creditCardFinancialCaptureTransactionRequestActionTaskReference = creditCardFinancialCaptureTransactionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditCardFinancialCaptureTransactionRequestActionTaskRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionRequestActionTaskRecord() {
    return creditCardFinancialCaptureTransactionRequestActionTaskRecord;
  }

  public void setCreditCardFinancialCaptureTransactionRequestActionTaskRecord(Object creditCardFinancialCaptureTransactionRequestActionTaskRecord) {
    this.creditCardFinancialCaptureTransactionRequestActionTaskRecord = creditCardFinancialCaptureTransactionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

