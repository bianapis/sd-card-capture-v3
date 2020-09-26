package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureRetrieveInputModelCardCaptureOfferedService;
import org.bian.dto.SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureRetrieveInputModel
 */
public class SDCardCaptureRetrieveInputModel   {
  private Object cardCaptureRetrieveActionTaskRecord = null;

  private String cardCaptureRetrieveActionRequest = null;

  private SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecord cardCaptureRetrieveActionRecord = null;

  private SDCardCaptureRetrieveInputModelCardCaptureOfferedService cardCaptureOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cardCaptureRetrieveActionTaskRecord
  **/

  public Object getCardCaptureRetrieveActionTaskRecord() {
    return cardCaptureRetrieveActionTaskRecord;
  }

  public void setCardCaptureRetrieveActionTaskRecord(Object cardCaptureRetrieveActionTaskRecord) {
    this.cardCaptureRetrieveActionTaskRecord = cardCaptureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cardCaptureRetrieveActionRequest
  **/

  public String getCardCaptureRetrieveActionRequest() {
    return cardCaptureRetrieveActionRequest;
  }

  public void setCardCaptureRetrieveActionRequest(String cardCaptureRetrieveActionRequest) {
    this.cardCaptureRetrieveActionRequest = cardCaptureRetrieveActionRequest;
  }


  /**
   * Get cardCaptureRetrieveActionRecord
   * @return cardCaptureRetrieveActionRecord
  **/

  public SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecord getCardCaptureRetrieveActionRecord() {
    return cardCaptureRetrieveActionRecord;
  }

  public void setCardCaptureRetrieveActionRecord(SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecord cardCaptureRetrieveActionRecord) {
    this.cardCaptureRetrieveActionRecord = cardCaptureRetrieveActionRecord;
  }


  /**
   * Get cardCaptureOfferedService
   * @return cardCaptureOfferedService
  **/

  public SDCardCaptureRetrieveInputModelCardCaptureOfferedService getCardCaptureOfferedService() {
    return cardCaptureOfferedService;
  }

  public void setCardCaptureOfferedService(SDCardCaptureRetrieveInputModelCardCaptureOfferedService cardCaptureOfferedService) {
    this.cardCaptureOfferedService = cardCaptureOfferedService;
  }


}

