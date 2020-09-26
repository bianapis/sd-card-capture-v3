package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureUpdateOutputModel
 */
public class BQTransactionCaptureUpdateOutputModel   {
  private String transactionCaptureUpdateActionTaskReference = null;

  private Object transactionCaptureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return transactionCaptureUpdateActionTaskReference
  **/

  public String getTransactionCaptureUpdateActionTaskReference() {
    return transactionCaptureUpdateActionTaskReference;
  }

  public void setTransactionCaptureUpdateActionTaskReference(String transactionCaptureUpdateActionTaskReference) {
    this.transactionCaptureUpdateActionTaskReference = transactionCaptureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return transactionCaptureUpdateActionTaskRecord
  **/

  public Object getTransactionCaptureUpdateActionTaskRecord() {
    return transactionCaptureUpdateActionTaskRecord;
  }

  public void setTransactionCaptureUpdateActionTaskRecord(Object transactionCaptureUpdateActionTaskRecord) {
    this.transactionCaptureUpdateActionTaskRecord = transactionCaptureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
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

