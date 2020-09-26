package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureConfigureInputModel
 */
public class SDCardCaptureConfigureInputModel   {
  private Object cardCaptureConfigurationActionTaskRecord = null;

  private String cardCaptureServicingSessionReference = null;

  private String cardCaptureServiceReference = null;

  private SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return cardCaptureConfigurationActionTaskRecord
  **/

  public Object getCardCaptureConfigurationActionTaskRecord() {
    return cardCaptureConfigurationActionTaskRecord;
  }

  public void setCardCaptureConfigurationActionTaskRecord(Object cardCaptureConfigurationActionTaskRecord) {
    this.cardCaptureConfigurationActionTaskRecord = cardCaptureConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardCaptureServicingSessionReference
  **/

  public String getCardCaptureServicingSessionReference() {
    return cardCaptureServicingSessionReference;
  }

  public void setCardCaptureServicingSessionReference(String cardCaptureServicingSessionReference) {
    this.cardCaptureServicingSessionReference = cardCaptureServicingSessionReference;
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

  public SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecord getCardCaptureServiceConfigurationRecord() {
    return cardCaptureServiceConfigurationRecord;
  }

  public void setCardCaptureServiceConfigurationRecord(SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord) {
    this.cardCaptureServiceConfigurationRecord = cardCaptureServiceConfigurationRecord;
  }


}

