package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis;
import org.bian.dto.BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionAuthorizationRetrieveOutputModel
 */
public class BQTransactionAuthorizationRetrieveOutputModel   {
  private String transactionCapturePreconditions = null;

  private String transactionCaptureTaskSchedule = null;

  private String businessService = null;

  private String transactionCapturePostconditions = null;

  private String transactionCaptureServiceType = null;

  private String transactionCaptureServiceDescription = null;

  private String transactionCaptureServiceInputsandOuputs = null;

  private String transactionCaptureServiceWorkProduct = null;

  private String transactionCaptureServiceName = null;

  private String transactionAuthorizationRetrieveActionTaskReference = null;

  private Object transactionAuthorizationRetrieveActionTaskRecord = null;

  private String transactionAuthorizationRetrieveActionResponse = null;

  private BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport transactionAuthorizationInstanceReport = null;

  private BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis transactionAuthorizationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Authorization instance retrieve service call 
   * @return transactionAuthorizationRetrieveActionTaskReference
  **/

  public String getTransactionAuthorizationRetrieveActionTaskReference() {
    return transactionAuthorizationRetrieveActionTaskReference;
  }

  public void setTransactionAuthorizationRetrieveActionTaskReference(String transactionAuthorizationRetrieveActionTaskReference) {
    this.transactionAuthorizationRetrieveActionTaskReference = transactionAuthorizationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionAuthorizationRetrieveActionTaskRecord
  **/

  public Object getTransactionAuthorizationRetrieveActionTaskRecord() {
    return transactionAuthorizationRetrieveActionTaskRecord;
  }

  public void setTransactionAuthorizationRetrieveActionTaskRecord(Object transactionAuthorizationRetrieveActionTaskRecord) {
    this.transactionAuthorizationRetrieveActionTaskRecord = transactionAuthorizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionAuthorizationRetrieveActionResponse
  **/

  public String getTransactionAuthorizationRetrieveActionResponse() {
    return transactionAuthorizationRetrieveActionResponse;
  }

  public void setTransactionAuthorizationRetrieveActionResponse(String transactionAuthorizationRetrieveActionResponse) {
    this.transactionAuthorizationRetrieveActionResponse = transactionAuthorizationRetrieveActionResponse;
  }


  /**
   * Get transactionAuthorizationInstanceReport
   * @return transactionAuthorizationInstanceReport
  **/

  public BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport getTransactionAuthorizationInstanceReport() {
    return transactionAuthorizationInstanceReport;
  }

  public void setTransactionAuthorizationInstanceReport(BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceReport transactionAuthorizationInstanceReport) {
    this.transactionAuthorizationInstanceReport = transactionAuthorizationInstanceReport;
  }


  /**
   * Get transactionAuthorizationInstanceAnalysis
   * @return transactionAuthorizationInstanceAnalysis
  **/

  public BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis getTransactionAuthorizationInstanceAnalysis() {
    return transactionAuthorizationInstanceAnalysis;
  }

  public void setTransactionAuthorizationInstanceAnalysis(BQTransactionAuthorizationRetrieveOutputModelTransactionAuthorizationInstanceAnalysis transactionAuthorizationInstanceAnalysis) {
    this.transactionAuthorizationInstanceAnalysis = transactionAuthorizationInstanceAnalysis;
  }


}

