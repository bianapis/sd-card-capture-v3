package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceAnalysis
 */
public class CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceAnalysis   {
  private String creditCardFinancialCaptureTransactionInstanceAnalysisData = null;

  private String creditCardFinancialCaptureTransactionInstanceAnalysisReportType = null;

  private Object creditCardFinancialCaptureTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditCardFinancialCaptureTransactionInstanceAnalysisData
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceAnalysisData() {
    return creditCardFinancialCaptureTransactionInstanceAnalysisData;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceAnalysisData(String creditCardFinancialCaptureTransactionInstanceAnalysisData) {
    this.creditCardFinancialCaptureTransactionInstanceAnalysisData = creditCardFinancialCaptureTransactionInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditCardFinancialCaptureTransactionInstanceAnalysisReport
  **/

  public Object getCreditCardFinancialCaptureTransactionInstanceAnalysisReport() {
    return creditCardFinancialCaptureTransactionInstanceAnalysisReport;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceAnalysisReport(Object creditCardFinancialCaptureTransactionInstanceAnalysisReport) {
    this.creditCardFinancialCaptureTransactionInstanceAnalysisReport = creditCardFinancialCaptureTransactionInstanceAnalysisReport;
  }


}

