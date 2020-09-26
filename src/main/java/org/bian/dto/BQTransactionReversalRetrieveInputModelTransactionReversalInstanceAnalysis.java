package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionReversalRetrieveInputModelTransactionReversalInstanceAnalysis
 */
public class BQTransactionReversalRetrieveInputModelTransactionReversalInstanceAnalysis   {
  private String transactionReversalInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return transactionReversalInstanceAnalysisReference
  **/

  public String getTransactionReversalInstanceAnalysisReference() {
    return transactionReversalInstanceAnalysisReference;
  }

  public void setTransactionReversalInstanceAnalysisReference(String transactionReversalInstanceAnalysisReference) {
    this.transactionReversalInstanceAnalysisReference = transactionReversalInstanceAnalysisReference;
  }


}

