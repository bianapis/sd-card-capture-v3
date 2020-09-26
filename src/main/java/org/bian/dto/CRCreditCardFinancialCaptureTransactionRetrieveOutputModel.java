package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceAnalysis;
import org.bian.dto.CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionRetrieveOutputModel
 */
public class CRCreditCardFinancialCaptureTransactionRetrieveOutputModel   {
  private String creditChargeCardFinancialCaptureTransactionParameterType = null;

  private String creditChargeCardFinancialCaptureTransactionSelectedOption = null;

  private String creditChargeCardFinancialCaptureTransactionStatus = null;

  private String creditChargeCardFinancialCaptureTransactionType = null;

  private String creditChargeCardFinancialCaptureTransactionTransactionType = null;

  private String creditCardFinancialCaptureTransactionRetrieveActionTaskReference = null;

  private Object creditCardFinancialCaptureTransactionRetrieveActionTaskRecord = null;

  private String creditCardFinancialCaptureTransactionRetrieveActionResponse = null;

  private CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceReportRecord creditCardFinancialCaptureTransactionInstanceReportRecord = null;

  private CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceAnalysis creditCardFinancialCaptureTransactionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Card Financial Capture Transaction instance retrieve service call 
   * @return creditCardFinancialCaptureTransactionRetrieveActionTaskReference
  **/

  public String getCreditCardFinancialCaptureTransactionRetrieveActionTaskReference() {
    return creditCardFinancialCaptureTransactionRetrieveActionTaskReference;
  }

  public void setCreditCardFinancialCaptureTransactionRetrieveActionTaskReference(String creditCardFinancialCaptureTransactionRetrieveActionTaskReference) {
    this.creditCardFinancialCaptureTransactionRetrieveActionTaskReference = creditCardFinancialCaptureTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditCardFinancialCaptureTransactionRetrieveActionTaskRecord
  **/

  public Object getCreditCardFinancialCaptureTransactionRetrieveActionTaskRecord() {
    return creditCardFinancialCaptureTransactionRetrieveActionTaskRecord;
  }

  public void setCreditCardFinancialCaptureTransactionRetrieveActionTaskRecord(Object creditCardFinancialCaptureTransactionRetrieveActionTaskRecord) {
    this.creditCardFinancialCaptureTransactionRetrieveActionTaskRecord = creditCardFinancialCaptureTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditCardFinancialCaptureTransactionRetrieveActionResponse
  **/

  public String getCreditCardFinancialCaptureTransactionRetrieveActionResponse() {
    return creditCardFinancialCaptureTransactionRetrieveActionResponse;
  }

  public void setCreditCardFinancialCaptureTransactionRetrieveActionResponse(String creditCardFinancialCaptureTransactionRetrieveActionResponse) {
    this.creditCardFinancialCaptureTransactionRetrieveActionResponse = creditCardFinancialCaptureTransactionRetrieveActionResponse;
  }


  /**
   * Get creditCardFinancialCaptureTransactionInstanceReportRecord
   * @return creditCardFinancialCaptureTransactionInstanceReportRecord
  **/

  public CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceReportRecord getCreditCardFinancialCaptureTransactionInstanceReportRecord() {
    return creditCardFinancialCaptureTransactionInstanceReportRecord;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReportRecord(CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceReportRecord creditCardFinancialCaptureTransactionInstanceReportRecord) {
    this.creditCardFinancialCaptureTransactionInstanceReportRecord = creditCardFinancialCaptureTransactionInstanceReportRecord;
  }


  /**
   * Get creditCardFinancialCaptureTransactionInstanceAnalysis
   * @return creditCardFinancialCaptureTransactionInstanceAnalysis
  **/

  public CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceAnalysis getCreditCardFinancialCaptureTransactionInstanceAnalysis() {
    return creditCardFinancialCaptureTransactionInstanceAnalysis;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceAnalysis(CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceAnalysis creditCardFinancialCaptureTransactionInstanceAnalysis) {
    this.creditCardFinancialCaptureTransactionInstanceAnalysis = creditCardFinancialCaptureTransactionInstanceAnalysis;
  }


}

