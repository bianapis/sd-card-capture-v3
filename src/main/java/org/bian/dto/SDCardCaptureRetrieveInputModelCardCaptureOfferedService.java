package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureRetrieveInputModelCardCaptureOfferedServiceCardCaptureServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureRetrieveInputModelCardCaptureOfferedService
 */
public class SDCardCaptureRetrieveInputModelCardCaptureOfferedService   {
  private String cardCaptureServiceReference = null;

  private SDCardCaptureRetrieveInputModelCardCaptureOfferedServiceCardCaptureServiceRecord cardCaptureServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return cardCaptureServiceReference
  **/

  public String getCardCaptureServiceReference() {
    return cardCaptureServiceReference;
  }

  public void setCardCaptureServiceReference(String cardCaptureServiceReference) {
    this.cardCaptureServiceReference = cardCaptureServiceReference;
  }


  /**
   * Get cardCaptureServiceRecord
   * @return cardCaptureServiceRecord
  **/

  public SDCardCaptureRetrieveInputModelCardCaptureOfferedServiceCardCaptureServiceRecord getCardCaptureServiceRecord() {
    return cardCaptureServiceRecord;
  }

  public void setCardCaptureServiceRecord(SDCardCaptureRetrieveInputModelCardCaptureOfferedServiceCardCaptureServiceRecord cardCaptureServiceRecord) {
    this.cardCaptureServiceRecord = cardCaptureServiceRecord;
  }


}

