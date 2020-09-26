package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionReversalRetrieveInputModelTransactionReversalInstanceReport
 */
public class BQTransactionReversalRetrieveInputModelTransactionReversalInstanceReport   {
  private String transactionReversalInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return transactionReversalInstanceReportReference
  **/

  public String getTransactionReversalInstanceReportReference() {
    return transactionReversalInstanceReportReference;
  }

  public void setTransactionReversalInstanceReportReference(String transactionReversalInstanceReportReference) {
    this.transactionReversalInstanceReportReference = transactionReversalInstanceReportReference;
  }


}

