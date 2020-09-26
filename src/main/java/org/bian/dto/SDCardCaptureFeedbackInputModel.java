package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureFeedbackInputModelCardCaptureFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureFeedbackInputModel
 */
public class SDCardCaptureFeedbackInputModel   {
  private Object cardCaptureFeedbackActionTaskRecord = null;

  private SDCardCaptureFeedbackInputModelCardCaptureFeedbackActionRecord cardCaptureFeedbackActionRecord = null;


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

  public SDCardCaptureFeedbackInputModelCardCaptureFeedbackActionRecord getCardCaptureFeedbackActionRecord() {
    return cardCaptureFeedbackActionRecord;
  }

  public void setCardCaptureFeedbackActionRecord(SDCardCaptureFeedbackInputModelCardCaptureFeedbackActionRecord cardCaptureFeedbackActionRecord) {
    this.cardCaptureFeedbackActionRecord = cardCaptureFeedbackActionRecord;
  }


}

