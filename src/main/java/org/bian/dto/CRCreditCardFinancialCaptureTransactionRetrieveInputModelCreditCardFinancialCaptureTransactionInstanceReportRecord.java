package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceReportRecord
 */
public class CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceReportRecord   {
  private String creditCardFinancialCaptureTransactionInstanceReportReference = null;

  private String creditCardFinancialCaptureTransactionInstanceReportType = null;

  private String creditCardFinancialCaptureTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditCardFinancialCaptureTransactionInstanceReportReference
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceReportReference() {
    return creditCardFinancialCaptureTransactionInstanceReportReference;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReportReference(String creditCardFinancialCaptureTransactionInstanceReportReference) {
    this.creditCardFinancialCaptureTransactionInstanceReportReference = creditCardFinancialCaptureTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditCardFinancialCaptureTransactionInstanceReportType
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceReportType() {
    return creditCardFinancialCaptureTransactionInstanceReportType;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReportType(String creditCardFinancialCaptureTransactionInstanceReportType) {
    this.creditCardFinancialCaptureTransactionInstanceReportType = creditCardFinancialCaptureTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditCardFinancialCaptureTransactionInstanceReportParameters
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceReportParameters() {
    return creditCardFinancialCaptureTransactionInstanceReportParameters;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReportParameters(String creditCardFinancialCaptureTransactionInstanceReportParameters) {
    this.creditCardFinancialCaptureTransactionInstanceReportParameters = creditCardFinancialCaptureTransactionInstanceReportParameters;
  }


}

