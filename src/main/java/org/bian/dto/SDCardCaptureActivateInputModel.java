package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureActivateInputModel
 */
public class SDCardCaptureActivateInputModel   {
  private Object cardCaptureActivationActionTaskRecord = null;

  private String cardCaptureCenterReference = null;

  private String cardCaptureServiceReference = null;

  private SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return cardCaptureActivationActionTaskRecord
  **/

  public Object getCardCaptureActivationActionTaskRecord() {
    return cardCaptureActivationActionTaskRecord;
  }

  public void setCardCaptureActivationActionTaskRecord(Object cardCaptureActivationActionTaskRecord) {
    this.cardCaptureActivationActionTaskRecord = cardCaptureActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return cardCaptureCenterReference
  **/

  public String getCardCaptureCenterReference() {
    return cardCaptureCenterReference;
  }

  public void setCardCaptureCenterReference(String cardCaptureCenterReference) {
    this.cardCaptureCenterReference = cardCaptureCenterReference;
  }


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
   * Get cardCaptureServiceConfigurationRecord
   * @return cardCaptureServiceConfigurationRecord
  **/

  public SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecord getCardCaptureServiceConfigurationRecord() {
    return cardCaptureServiceConfigurationRecord;
  }

  public void setCardCaptureServiceConfigurationRecord(SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord) {
    this.cardCaptureServiceConfigurationRecord = cardCaptureServiceConfigurationRecord;
  }


}

