package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationInitiateInputModel
 */
public class BQTransactionAuthorizationInitiateInputModel   {
  private String transactionCapturePreconditions = null;

  private String transactionCaptureTaskSchedule = null;

  private String businessService = null;

  private String transactionCapturePostconditions = null;

  private String transactionCaptureServiceType = null;

  private String transactionCaptureServiceDescription = null;

  private String transactionCaptureServiceInputsandOuputs = null;

  private String transactionCaptureServiceWorkProduct = null;

  private String transactionCaptureServiceName = null;

  private String creditCardFinancialCaptureTransactionInstanceReference = null;

  private Object transactionAuthorizationInitiateActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return transactionCapturePreconditions
  **/

  public String getTransactionCapturePreconditions() {
    return transactionCapturePreconditions;
  }

  public void setTransactionCapturePreconditions(String transactionCapturePreconditions) {
    this.transactionCapturePreconditions = transactionCapturePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return transactionCaptureTaskSchedule
  **/

  public String getTransactionCaptureTaskSchedule() {
    return transactionCaptureTaskSchedule;
  }

  public void setTransactionCaptureTaskSchedule(String transactionCaptureTaskSchedule) {
    this.transactionCaptureTaskSchedule = transactionCaptureTaskSchedule;
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
   * @return transactionCapturePostconditions
  **/

  public String getTransactionCapturePostconditions() {
    return transactionCapturePostconditions;
  }

  public void setTransactionCapturePostconditions(String transactionCapturePostconditions) {
    this.transactionCapturePostconditions = transactionCapturePostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return transactionCaptureServiceType
  **/

  public String getTransactionCaptureServiceType() {
    return transactionCaptureServiceType;
  }

  public void setTransactionCaptureServiceType(String transactionCaptureServiceType) {
    this.transactionCaptureServiceType = transactionCaptureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return transactionCaptureServiceDescription
  **/

  public String getTransactionCaptureServiceDescription() {
    return transactionCaptureServiceDescription;
  }

  public void setTransactionCaptureServiceDescription(String transactionCaptureServiceDescription) {
    this.transactionCaptureServiceDescription = transactionCaptureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return transactionCaptureServiceInputsandOuputs
  **/

  public String getTransactionCaptureServiceInputsandOuputs() {
    return transactionCaptureServiceInputsandOuputs;
  }

  public void setTransactionCaptureServiceInputsandOuputs(String transactionCaptureServiceInputsandOuputs) {
    this.transactionCaptureServiceInputsandOuputs = transactionCaptureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return transactionCaptureServiceWorkProduct
  **/

  public String getTransactionCaptureServiceWorkProduct() {
    return transactionCaptureServiceWorkProduct;
  }

  public void setTransactionCaptureServiceWorkProduct(String transactionCaptureServiceWorkProduct) {
    this.transactionCaptureServiceWorkProduct = transactionCaptureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return transactionCaptureServiceName
  **/

  public String getTransactionCaptureServiceName() {
    return transactionCaptureServiceName;
  }

  public void setTransactionCaptureServiceName(String transactionCaptureServiceName) {
    this.transactionCaptureServiceName = transactionCaptureServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Credit Card Financial Capture Transaction instance 
   * @return creditCardFinancialCaptureTransactionInstanceReference
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceReference() {
    return creditCardFinancialCaptureTransactionInstanceReference;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReference(String creditCardFinancialCaptureTransactionInstanceReference) {
    this.creditCardFinancialCaptureTransactionInstanceReference = creditCardFinancialCaptureTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionAuthorizationInitiateActionRecord
  **/

  public Object getTransactionAuthorizationInitiateActionRecord() {
    return transactionAuthorizationInitiateActionRecord;
  }

  public void setTransactionAuthorizationInitiateActionRecord(Object transactionAuthorizationInitiateActionRecord) {
    this.transactionAuthorizationInitiateActionRecord = transactionAuthorizationInitiateActionRecord;
  }


}

