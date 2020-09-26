package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceReportRecord
 */
public class CRCreditCardFinancialCaptureTransactionRetrieveOutputModelCreditCardFinancialCaptureTransactionInstanceReportRecord   {
  private String creditCardFinancialCaptureTransactionInstanceReportData = null;

  private String creditCardFinancialCaptureTransactionInstanceReportType = null;

  private Object creditCardFinancialCaptureTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditCardFinancialCaptureTransactionInstanceReportData
  **/

  public String getCreditCardFinancialCaptureTransactionInstanceReportData() {
    return creditCardFinancialCaptureTransactionInstanceReportData;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReportData(String creditCardFinancialCaptureTransactionInstanceReportData) {
    this.creditCardFinancialCaptureTransactionInstanceReportData = creditCardFinancialCaptureTransactionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditCardFinancialCaptureTransactionInstanceReport
  **/

  public Object getCreditCardFinancialCaptureTransactionInstanceReport() {
    return creditCardFinancialCaptureTransactionInstanceReport;
  }

  public void setCreditCardFinancialCaptureTransactionInstanceReport(Object creditCardFinancialCaptureTransactionInstanceReport) {
    this.creditCardFinancialCaptureTransactionInstanceReport = creditCardFinancialCaptureTransactionInstanceReport;
  }


}

