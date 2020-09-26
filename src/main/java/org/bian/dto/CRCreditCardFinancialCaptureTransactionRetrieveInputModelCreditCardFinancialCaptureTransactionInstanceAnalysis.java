package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceAnalysis
 */
public class CRCreditCardFinancialCaptureTransactionRetrieveInputModelCreditCardFinancialCaptureTransactionInstanceAnalysis   {
  private String creditCardFinancialCaptureTransactionInstanceAnalysisReference = null;

  private String creditCardFinancialCaptureTransactionInstanceAnalysisReportType = null;

  private String creditCardFinancialCaptureTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditCardFinancialCaptureTransactionInstanceAnalysisReference
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceAnalysisReference() {
    return creditCardFinancialCaptureTransactionInstanceAnalysisReference;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceAnalysisReference(String creditCardFinancialCaptureTransactionInstanceAnalysisReference) {
    this.creditCardFinancialCaptureTransactionInstanceAnalysisReference = creditCardFinancialCaptureTransactionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditCardFinancialCaptureTransactionInstanceAnalysisReportType
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceAnalysisReportType() {
    return creditCardFinancialCaptureTransactionInstanceAnalysisReportType;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceAnalysisReportType(String creditCardFinancialCaptureTransactionInstanceAnalysisReportType) {
    this.creditCardFinancialCaptureTransactionInstanceAnalysisReportType = creditCardFinancialCaptureTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditCardFinancialCaptureTransactionInstanceAnalysisParameters
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceAnalysisParameters() {
    return creditCardFinancialCaptureTransactionInstanceAnalysisParameters;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceAnalysisParameters(String creditCardFinancialCaptureTransactionInstanceAnalysisParameters) {
    this.creditCardFinancialCaptureTransactionInstanceAnalysisParameters = creditCardFinancialCaptureTransactionInstanceAnalysisParameters;
  }


}

