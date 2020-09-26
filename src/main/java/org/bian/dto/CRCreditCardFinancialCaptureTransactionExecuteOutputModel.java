package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionExecuteOutputModel
 */
public class CRCreditCardFinancialCaptureTransactionExecuteOutputModel   {
  private String creditChargeCardFinancialCaptureTransactionParameterType = null;

  private String creditChargeCardFinancialCaptureTransactionSelectedOption = null;

  private String creditChargeCardFinancialCaptureTransactionStatus = null;

  private String creditCardFinancialCaptureTransactionExecuteActionTaskReference = null;

  private Object creditCardFinancialCaptureTransactionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Card Financial Capture Transaction instance execute service call 
   * @return creditCardFinancialCaptureTransactionExecuteActionTaskReference
  **/

  public String getCreditCardFinancialCaptureTransactionExecuteActionTaskReference() {
    return creditCardFinancialCaptureTransactionExecuteActionTaskReference;
  }

  public void setCreditCardFinancialCaptureTransactionExecuteActionTaskReference(String creditCardFinancialCaptureTransactionExecuteActionTaskReference) {
    this.creditCardFinancialCaptureTransactionExecuteActionTaskReference = creditCardFinancialCaptureTransactionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return creditCardFinancialCaptureTransactionExecuteActionTaskRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionExecuteActionTaskRecord() {
    return creditCardFinancialCaptureTransactionExecuteActionTaskRecord;
  }

  public void setCreditCardFinancialCaptureTransactionExecuteActionTaskRecord(Object creditCardFinancialCaptureTransactionExecuteActionTaskRecord) {
    this.creditCardFinancialCaptureTransactionExecuteActionTaskRecord = creditCardFinancialCaptureTransactionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

