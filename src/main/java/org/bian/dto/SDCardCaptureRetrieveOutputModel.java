package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureRetrieveOutputModelCardCaptureOfferedService;
import org.bian.dto.SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureRetrieveOutputModel
 */
public class SDCardCaptureRetrieveOutputModel   {
  private String cardCaptureRetrieveActionTaskReference = null;

  private Object cardCaptureRetrieveActionTaskRecord = null;

  private String cardCaptureRetrieveActionResponse = null;

  private SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecord cardCaptureRetrieveActionRecord = null;

  private SDCardCaptureRetrieveOutputModelCardCaptureOfferedService cardCaptureOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return cardCaptureRetrieveActionTaskReference
  **/

  public String getCardCaptureRetrieveActionTaskReference() {
    return cardCaptureRetrieveActionTaskReference;
  }

  public void setCardCaptureRetrieveActionTaskReference(String cardCaptureRetrieveActionTaskReference) {
    this.cardCaptureRetrieveActionTaskReference = cardCaptureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cardCaptureRetrieveActionResponse
  **/

  public String getCardCaptureRetrieveActionResponse() {
    return cardCaptureRetrieveActionResponse;
  }

  public void setCardCaptureRetrieveActionResponse(String cardCaptureRetrieveActionResponse) {
    this.cardCaptureRetrieveActionResponse = cardCaptureRetrieveActionResponse;
  }


  /**
   * Get cardCaptureRetrieveActionRecord
   * @return cardCaptureRetrieveActionRecord
  **/

  public SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecord getCardCaptureRetrieveActionRecord() {
    return cardCaptureRetrieveActionRecord;
  }

  public void setCardCaptureRetrieveActionRecord(SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecord cardCaptureRetrieveActionRecord) {
    this.cardCaptureRetrieveActionRecord = cardCaptureRetrieveActionRecord;
  }


  /**
   * Get cardCaptureOfferedService
   * @return cardCaptureOfferedService
  **/

  public SDCardCaptureRetrieveOutputModelCardCaptureOfferedService getCardCaptureOfferedService() {
    return cardCaptureOfferedService;
  }

  public void setCardCaptureOfferedService(SDCardCaptureRetrieveOutputModelCardCaptureOfferedService cardCaptureOfferedService) {
    this.cardCaptureOfferedService = cardCaptureOfferedService;
  }


}

