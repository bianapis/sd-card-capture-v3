package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionUpdateInputModel
 */
public class CRCreditCardFinancialCaptureTransactionUpdateInputModel   {
  private String cardCaptureServicingSessionReference = null;

  private String creditCardFinancialCaptureTransactionInstanceReference = null;

  private String creditChargeCardFinancialCaptureTransactionParameterType = null;

  private String creditChargeCardFinancialCaptureTransactionSelectedOption = null;

  private String creditChargeCardFinancialCaptureTransactionStatus = null;

  private String creditChargeCardFinancialCaptureTransactionType = null;

  private String creditChargeCardFinancialCaptureTransactionTransactionType = null;

  private Object creditCardFinancialCaptureTransactionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardCaptureServicingSessionReference
  **/

  public String getCardCaptureServicingSessionReference() {
    return cardCaptureServicingSessionReference;
  }

  public void setCardCaptureServicingSessionReference(String cardCaptureServicingSessionReference) {
    this.cardCaptureServicingSessionReference = cardCaptureServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of business action for this Credit/Charge Card Financial Capture Transaction 
   * @return creditChargeCardFinancialCaptureTransactionType
  **/

  public String getCreditChargeCardFinancialCaptureTransactionType() {
    return creditChargeCardFinancialCaptureTransactionType;
  }

  public void setCreditChargeCardFinancialCaptureTransactionType(String creditChargeCardFinancialCaptureTransactionType) {
    this.creditChargeCardFinancialCaptureTransactionType = creditChargeCardFinancialCaptureTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of transaction for this Credit/Charge Card Financial Capture Transaction 
   * @return creditChargeCardFinancialCaptureTransactionTransactionType
  **/

  public String getCreditChargeCardFinancialCaptureTransactionTransactionType() {
    return creditChargeCardFinancialCaptureTransactionTransactionType;
  }

  public void setCreditChargeCardFinancialCaptureTransactionTransactionType(String creditChargeCardFinancialCaptureTransactionTransactionType) {
    this.creditChargeCardFinancialCaptureTransactionTransactionType = creditChargeCardFinancialCaptureTransactionTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditCardFinancialCaptureTransactionUpdateActionTaskRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionUpdateActionTaskRecord() {
    return creditCardFinancialCaptureTransactionUpdateActionTaskRecord;
  }

  public void setCreditCardFinancialCaptureTransactionUpdateActionTaskRecord(Object creditCardFinancialCaptureTransactionUpdateActionTaskRecord) {
    this.creditCardFinancialCaptureTransactionUpdateActionTaskRecord = creditCardFinancialCaptureTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

