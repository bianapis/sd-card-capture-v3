package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionInitiateOutputModel
 */
public class CRCreditCardFinancialCaptureTransactionInitiateOutputModel   {
  private String creditCardFinancialCaptureTransactionInstanceReference = null;

  private String creditCardFinancialCaptureTransactionInitiateActionReference = null;

  private Object creditCardFinancialCaptureTransactionInitiateActionRecord = null;

  private String creditCardFinancialCaptureTransactionInstanceStatus = null;

  private String creditChargeCardFinancialCaptureTransactionParameterType = null;

  private String creditChargeCardFinancialCaptureTransactionSelectedOption = null;

  private String creditChargeCardFinancialCaptureTransactionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Card Financial Capture Transaction instance 
   * @return creditCardFinancialCaptureTransactionInstanceReference
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceReference() {
    return creditCardFinancialCaptureTransactionInstanceReference;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReference(String creditCardFinancialCaptureTransactionInstanceReference) {
    this.creditCardFinancialCaptureTransactionInstanceReference = creditCardFinancialCaptureTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return creditCardFinancialCaptureTransactionInitiateActionReference
  **/

  public String getCreditCardFinancialCaptureTransactionInitiateActionReference() {
    return creditCardFinancialCaptureTransactionInitiateActionReference;
  }

  public void setCreditCardFinancialCaptureTransactionInitiateActionReference(String creditCardFinancialCaptureTransactionInitiateActionReference) {
    this.creditCardFinancialCaptureTransactionInitiateActionReference = creditCardFinancialCaptureTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return creditCardFinancialCaptureTransactionInitiateActionRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionInitiateActionRecord() {
    return creditCardFinancialCaptureTransactionInitiateActionRecord;
  }

  public void setCreditCardFinancialCaptureTransactionInitiateActionRecord(Object creditCardFinancialCaptureTransactionInitiateActionRecord) {
    this.creditCardFinancialCaptureTransactionInitiateActionRecord = creditCardFinancialCaptureTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Credit Card Financial Capture Transaction instance (e.g. initialised, pending, active) 
   * @return creditCardFinancialCaptureTransactionInstanceStatus
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceStatus() {
    return creditCardFinancialCaptureTransactionInstanceStatus;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceStatus(String creditCardFinancialCaptureTransactionInstanceStatus) {
    this.creditCardFinancialCaptureTransactionInstanceStatus = creditCardFinancialCaptureTransactionInstanceStatus;
  }


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


}

