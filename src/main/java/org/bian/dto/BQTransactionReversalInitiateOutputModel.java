package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionReversalInitiateOutputModel
 */
public class BQTransactionReversalInitiateOutputModel   {
  private String transactionAuthorizationPreconditions = null;

  private String transactionAuthorizationTaskSchedule = null;

  private String businessService = null;

  private String transactionAuthorizationPostconditions = null;

  private String transactionAuthorizationServiceType = null;

  private String transactionAuthorizationServiceDescription = null;

  private String transactionAuthorizationServiceInputsandOuputs = null;

  private String transactionAuthorizationServiceWorkProduct = null;

  private String transactionReversalInstanceReference = null;

  private String transactionReversalInitiateActionReference = null;

  private Object transactionReversalInitiateActionRecord = null;

  private String transactionReversalInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return transactionAuthorizationPreconditions
  **/

  public String getTransactionAuthorizationPreconditions() {
    return transactionAuthorizationPreconditions;
  }

  public void setTransactionAuthorizationPreconditions(String transactionAuthorizationPreconditions) {
    this.transactionAuthorizationPreconditions = transactionAuthorizationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return transactionAuthorizationTaskSchedule
  **/

  public String getTransactionAuthorizationTaskSchedule() {
    return transactionAuthorizationTaskSchedule;
  }

  public void setTransactionAuthorizationTaskSchedule(String transactionAuthorizationTaskSchedule) {
    this.transactionAuthorizationTaskSchedule = transactionAuthorizationTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Credit/Charge Card Financial Capture Transaction specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return transactionAuthorizationPostconditions
  **/

  public String getTransactionAuthorizationPostconditions() {
    return transactionAuthorizationPostconditions;
  }

  public void setTransactionAuthorizationPostconditions(String transactionAuthorizationPostconditions) {
    this.transactionAuthorizationPostconditions = transactionAuthorizationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return transactionAuthorizationServiceType
  **/

  public String getTransactionAuthorizationServiceType() {
    return transactionAuthorizationServiceType;
  }

  public void setTransactionAuthorizationServiceType(String transactionAuthorizationServiceType) {
    this.transactionAuthorizationServiceType = transactionAuthorizationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return transactionAuthorizationServiceDescription
  **/

  public String getTransactionAuthorizationServiceDescription() {
    return transactionAuthorizationServiceDescription;
  }

  public void setTransactionAuthorizationServiceDescription(String transactionAuthorizationServiceDescription) {
    this.transactionAuthorizationServiceDescription = transactionAuthorizationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return transactionAuthorizationServiceInputsandOuputs
  **/

  public String getTransactionAuthorizationServiceInputsandOuputs() {
    return transactionAuthorizationServiceInputsandOuputs;
  }

  public void setTransactionAuthorizationServiceInputsandOuputs(String transactionAuthorizationServiceInputsandOuputs) {
    this.transactionAuthorizationServiceInputsandOuputs = transactionAuthorizationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return transactionAuthorizationServiceWorkProduct
  **/

  public String getTransactionAuthorizationServiceWorkProduct() {
    return transactionAuthorizationServiceWorkProduct;
  }

  public void setTransactionAuthorizationServiceWorkProduct(String transactionAuthorizationServiceWorkProduct) {
    this.transactionAuthorizationServiceWorkProduct = transactionAuthorizationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Reversal instance 
   * @return transactionReversalInstanceReference
  **/

  public String getTransactionReversalInstanceReference() {
    return transactionReversalInstanceReference;
  }

  public void setTransactionReversalInstanceReference(String transactionReversalInstanceReference) {
    this.transactionReversalInstanceReference = transactionReversalInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return transactionReversalInitiateActionReference
  **/

  public String getTransactionReversalInitiateActionReference() {
    return transactionReversalInitiateActionReference;
  }

  public void setTransactionReversalInitiateActionReference(String transactionReversalInitiateActionReference) {
    this.transactionReversalInitiateActionReference = transactionReversalInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionReversalInitiateActionRecord
  **/

  public Object getTransactionReversalInitiateActionRecord() {
    return transactionReversalInitiateActionRecord;
  }

  public void setTransactionReversalInitiateActionRecord(Object transactionReversalInitiateActionRecord) {
    this.transactionReversalInitiateActionRecord = transactionReversalInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Reversal instance (e.g. initialised, pending, active) 
   * @return transactionReversalInstanceStatus
  **/

  public String getTransactionReversalInstanceStatus() {
    return transactionReversalInstanceStatus;
  }

  public void setTransactionReversalInstanceStatus(String transactionReversalInstanceStatus) {
    this.transactionReversalInstanceStatus = transactionReversalInstanceStatus;
  }


}

