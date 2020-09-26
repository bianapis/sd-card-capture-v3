package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureFeedbackOutputModelCardCaptureFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureFeedbackOutputModel
 */
public class SDCardCaptureFeedbackOutputModel   {
  private String cardCaptureFeedbackActionTaskReference = null;

  private Object cardCaptureFeedbackActionTaskRecord = null;

  private SDCardCaptureFeedbackOutputModelCardCaptureFeedbackActionRecord cardCaptureFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return cardCaptureFeedbackActionTaskReference
  **/

  public String getCardCaptureFeedbackActionTaskReference() {
    return cardCaptureFeedbackActionTaskReference;
  }

  public void setCardCaptureFeedbackActionTaskReference(String cardCaptureFeedbackActionTaskReference) {
    this.cardCaptureFeedbackActionTaskReference = cardCaptureFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return cardCaptureFeedbackActionTaskRecord
  **/

  public Object getCardCaptureFeedbackActionTaskRecord() {
    return cardCaptureFeedbackActionTaskRecord;
  }

  public void setCardCaptureFeedbackActionTaskRecord(Object cardCaptureFeedbackActionTaskRecord) {
    this.cardCaptureFeedbackActionTaskRecord = cardCaptureFeedbackActionTaskRecord;
  }


  /**
   * Get cardCaptureFeedbackActionRecord
   * @return cardCaptureFeedbackActionRecord
  **/

  public SDCardCaptureFeedbackOutputModelCardCaptureFeedbackActionRecord getCardCaptureFeedbackActionRecord() {
    return cardCaptureFeedbackActionRecord;
  }

  public void setCardCaptureFeedbackActionRecord(SDCardCaptureFeedbackOutputModelCardCaptureFeedbackActionRecord cardCaptureFeedbackActionRecord) {
    this.cardCaptureFeedbackActionRecord = cardCaptureFeedbackActionRecord;
  }


}

