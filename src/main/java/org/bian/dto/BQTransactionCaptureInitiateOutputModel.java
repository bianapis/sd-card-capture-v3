package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureInitiateOutputModel
 */
public class BQTransactionCaptureInitiateOutputModel   {
  private String transactionCaptureInstanceReference = null;

  private String transactionCaptureInitiateActionReference = null;

  private Object transactionCaptureInitiateActionRecord = null;

  private String transactionCaptureInstanceStatus = null;

  private String transactionReversalPreconditions = null;

  private String transactionReversalTaskSchedule = null;

  private String cardTransactionReversal = null;

  private String transactionReversalPostconditions = null;

  private String transactionReversalCardTransactionReversalServiceType = null;

  private String transactionReversalCardTransactionReversalServiceDescription = null;

  private String transactionReversalCardTransactionReversalServiceInputsandOuputs = null;

  private String transactionReversalCardTransactionReversalServiceWorkProduct = null;

  private String transactionReversalCardTransactionReversalServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Capture instance 
   * @return transactionCaptureInstanceReference
  **/

  public String getTransactionCaptureInstanceReference() {
    return transactionCaptureInstanceReference;
  }

  public void setTransactionCaptureInstanceReference(String transactionCaptureInstanceReference) {
    this.transactionCaptureInstanceReference = transactionCaptureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionCaptureInitiateActionReference
  **/

  public String getTransactionCaptureInitiateActionReference() {
    return transactionCaptureInitiateActionReference;
  }

  public void setTransactionCaptureInitiateActionReference(String transactionCaptureInitiateActionReference) {
    this.transactionCaptureInitiateActionReference = transactionCaptureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionCaptureInitiateActionRecord
  **/

  public Object getTransactionCaptureInitiateActionRecord() {
    return transactionCaptureInitiateActionRecord;
  }

  public void setTransactionCaptureInitiateActionRecord(Object transactionCaptureInitiateActionRecord) {
    this.transactionCaptureInitiateActionRecord = transactionCaptureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Capture instance (e.g. initialised, pending, active) 
   * @return transactionCaptureInstanceStatus
  **/

  public String getTransactionCaptureInstanceStatus() {
    return transactionCaptureInstanceStatus;
  }

  public void setTransactionCaptureInstanceStatus(String transactionCaptureInstanceStatus) {
    this.transactionCaptureInstanceStatus = transactionCaptureInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return transactionReversalPreconditions
  **/

  public String getTransactionReversalPreconditions() {
    return transactionReversalPreconditions;
  }

  public void setTransactionReversalPreconditions(String transactionReversalPreconditions) {
    this.transactionReversalPreconditions = transactionReversalPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return transactionReversalTaskSchedule
  **/

  public String getTransactionReversalTaskSchedule() {
    return transactionReversalTaskSchedule;
  }

  public void setTransactionReversalTaskSchedule(String transactionReversalTaskSchedule) {
    this.transactionReversalTaskSchedule = transactionReversalTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Credit/Charge Card Financial Capture Transaction specific Business Service 
   * @return cardTransactionReversal
  **/

  public String getCardTransactionReversal() {
    return cardTransactionReversal;
  }

  public void setCardTransactionReversal(String cardTransactionReversal) {
    this.cardTransactionReversal = cardTransactionReversal;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return transactionReversalPostconditions
  **/

  public String getTransactionReversalPostconditions() {
    return transactionReversalPostconditions;
  }

  public void setTransactionReversalPostconditions(String transactionReversalPostconditions) {
    this.transactionReversalPostconditions = transactionReversalPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return transactionReversalCardTransactionReversalServiceType
  **/

  public String getTransactionReversalCardTransactionReversalServiceType() {
    return transactionReversalCardTransactionReversalServiceType;
  }

  public void setTransactionReversalCardTransactionReversalServiceType(String transactionReversalCardTransactionReversalServiceType) {
    this.transactionReversalCardTransactionReversalServiceType = transactionReversalCardTransactionReversalServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return transactionReversalCardTransactionReversalServiceDescription
  **/

  public String getTransactionReversalCardTransactionReversalServiceDescription() {
    return transactionReversalCardTransactionReversalServiceDescription;
  }

  public void setTransactionReversalCardTransactionReversalServiceDescription(String transactionReversalCardTransactionReversalServiceDescription) {
    this.transactionReversalCardTransactionReversalServiceDescription = transactionReversalCardTransactionReversalServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return transactionReversalCardTransactionReversalServiceInputsandOuputs
  **/

  public String getTransactionReversalCardTransactionReversalServiceInputsandOuputs() {
    return transactionReversalCardTransactionReversalServiceInputsandOuputs;
  }

  public void setTransactionReversalCardTransactionReversalServiceInputsandOuputs(String transactionReversalCardTransactionReversalServiceInputsandOuputs) {
    this.transactionReversalCardTransactionReversalServiceInputsandOuputs = transactionReversalCardTransactionReversalServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return transactionReversalCardTransactionReversalServiceWorkProduct
  **/

  public String getTransactionReversalCardTransactionReversalServiceWorkProduct() {
    return transactionReversalCardTransactionReversalServiceWorkProduct;
  }

  public void setTransactionReversalCardTransactionReversalServiceWorkProduct(String transactionReversalCardTransactionReversalServiceWorkProduct) {
    this.transactionReversalCardTransactionReversalServiceWorkProduct = transactionReversalCardTransactionReversalServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return transactionReversalCardTransactionReversalServiceName
  **/

  public String getTransactionReversalCardTransactionReversalServiceName() {
    return transactionReversalCardTransactionReversalServiceName;
  }

  public void setTransactionReversalCardTransactionReversalServiceName(String transactionReversalCardTransactionReversalServiceName) {
    this.transactionReversalCardTransactionReversalServiceName = transactionReversalCardTransactionReversalServiceName;
  }


}

