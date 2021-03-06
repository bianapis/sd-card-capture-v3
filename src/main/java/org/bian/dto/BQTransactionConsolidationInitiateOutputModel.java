package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionConsolidationInitiateOutputModel
 */
public class BQTransactionConsolidationInitiateOutputModel   {
  private String transactionConsolidationInstanceReference = null;

  private String transactionConsolidationInitiateActionReference = null;

  private Object transactionConsolidationInitiateActionRecord = null;

  private String transactionConsolidationInstanceStatus = null;

  private String transactionConsolidationPreconditions = null;

  private String transactionConsolidationTaskSchedule = null;

  private String cardTransactionConsolidation = null;

  private String transactionConsolidationPostconditions = null;

  private String transactionConsolidationCardTransactionConsolidationServiceType = null;

  private String transactionConsolidationCardTransactionConsolidationServiceDescription = null;

  private String transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs = null;

  private String transactionConsolidationCardTransactionConsolidationServiceWorkProduct = null;

  private String transactionConsolidationCardTransactionConsolidationServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Consolidation instance 
   * @return transactionConsolidationInstanceReference
  **/

  public String getTransactionConsolidationInstanceReference() {
    return transactionConsolidationInstanceReference;
  }

  public void setTransactionConsolidationInstanceReference(String transactionConsolidationInstanceReference) {
    this.transactionConsolidationInstanceReference = transactionConsolidationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionConsolidationInitiateActionReference
  **/

  public String getTransactionConsolidationInitiateActionReference() {
    return transactionConsolidationInitiateActionReference;
  }

  public void setTransactionConsolidationInitiateActionReference(String transactionConsolidationInitiateActionReference) {
    this.transactionConsolidationInitiateActionReference = transactionConsolidationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionConsolidationInitiateActionRecord
  **/

  public Object getTransactionConsolidationInitiateActionRecord() {
    return transactionConsolidationInitiateActionRecord;
  }

  public void setTransactionConsolidationInitiateActionRecord(Object transactionConsolidationInitiateActionRecord) {
    this.transactionConsolidationInitiateActionRecord = transactionConsolidationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Consolidation instance (e.g. initialised, pending, active) 
   * @return transactionConsolidationInstanceStatus
  **/

  public String getTransactionConsolidationInstanceStatus() {
    return transactionConsolidationInstanceStatus;
  }

  public void setTransactionConsolidationInstanceStatus(String transactionConsolidationInstanceStatus) {
    this.transactionConsolidationInstanceStatus = transactionConsolidationInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return transactionConsolidationPreconditions
  **/

  public String getTransactionConsolidationPreconditions() {
    return transactionConsolidationPreconditions;
  }

  public void setTransactionConsolidationPreconditions(String transactionConsolidationPreconditions) {
    this.transactionConsolidationPreconditions = transactionConsolidationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return transactionConsolidationTaskSchedule
  **/

  public String getTransactionConsolidationTaskSchedule() {
    return transactionConsolidationTaskSchedule;
  }

  public void setTransactionConsolidationTaskSchedule(String transactionConsolidationTaskSchedule) {
    this.transactionConsolidationTaskSchedule = transactionConsolidationTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Credit/Charge Card Financial Capture Transaction specific Business Service 
   * @return cardTransactionConsolidation
  **/

  public String getCardTransactionConsolidation() {
    return cardTransactionConsolidation;
  }

  public void setCardTransactionConsolidation(String cardTransactionConsolidation) {
    this.cardTransactionConsolidation = cardTransactionConsolidation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return transactionConsolidationPostconditions
  **/

  public String getTransactionConsolidationPostconditions() {
    return transactionConsolidationPostconditions;
  }

  public void setTransactionConsolidationPostconditions(String transactionConsolidationPostconditions) {
    this.transactionConsolidationPostconditions = transactionConsolidationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return transactionConsolidationCardTransactionConsolidationServiceType
  **/

  public String getTransactionConsolidationCardTransactionConsolidationServiceType() {
    return transactionConsolidationCardTransactionConsolidationServiceType;
  }

  public void setTransactionConsolidationCardTransactionConsolidationServiceType(String transactionConsolidationCardTransactionConsolidationServiceType) {
    this.transactionConsolidationCardTransactionConsolidationServiceType = transactionConsolidationCardTransactionConsolidationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return transactionConsolidationCardTransactionConsolidationServiceDescription
  **/

  public String getTransactionConsolidationCardTransactionConsolidationServiceDescription() {
    return transactionConsolidationCardTransactionConsolidationServiceDescription;
  }

  public void setTransactionConsolidationCardTransactionConsolidationServiceDescription(String transactionConsolidationCardTransactionConsolidationServiceDescription) {
    this.transactionConsolidationCardTransactionConsolidationServiceDescription = transactionConsolidationCardTransactionConsolidationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs
  **/

  public String getTransactionConsolidationCardTransactionConsolidationServiceInputsandOuputs() {
    return transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs;
  }

  public void setTransactionConsolidationCardTransactionConsolidationServiceInputsandOuputs(String transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs) {
    this.transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs = transactionConsolidationCardTransactionConsolidationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return transactionConsolidationCardTransactionConsolidationServiceWorkProduct
  **/

  public String getTransactionConsolidationCardTransactionConsolidationServiceWorkProduct() {
    return transactionConsolidationCardTransactionConsolidationServiceWorkProduct;
  }

  public void setTransactionConsolidationCardTransactionConsolidationServiceWorkProduct(String transactionConsolidationCardTransactionConsolidationServiceWorkProduct) {
    this.transactionConsolidationCardTransactionConsolidationServiceWorkProduct = transactionConsolidationCardTransactionConsolidationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return transactionConsolidationCardTransactionConsolidationServiceName
  **/

  public String getTransactionConsolidationCardTransactionConsolidationServiceName() {
    return transactionConsolidationCardTransactionConsolidationServiceName;
  }

  public void setTransactionConsolidationCardTransactionConsolidationServiceName(String transactionConsolidationCardTransactionConsolidationServiceName) {
    this.transactionConsolidationCardTransactionConsolidationServiceName = transactionConsolidationCardTransactionConsolidationServiceName;
  }


}

