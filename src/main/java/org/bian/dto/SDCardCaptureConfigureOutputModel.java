package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureConfigureOutputModelCardCaptureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureConfigureOutputModel
 */
public class SDCardCaptureConfigureOutputModel   {
  private String cardCaptureConfigurationActionTaskReference = null;

  private Object cardCaptureConfigurationActionTaskRecord = null;

  private SDCardCaptureConfigureOutputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord = null;

  private String cardCaptureServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return cardCaptureConfigurationActionTaskReference
  **/

  public String getCardCaptureConfigurationActionTaskReference() {
    return cardCaptureConfigurationActionTaskReference;
  }

  public void setCardCaptureConfigurationActionTaskReference(String cardCaptureConfigurationActionTaskReference) {
    this.cardCaptureConfigurationActionTaskReference = cardCaptureConfigurationActionTaskReference;
  }


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
   * Get cardCaptureServiceConfigurationRecord
   * @return cardCaptureServiceConfigurationRecord
  **/

  public SDCardCaptureConfigureOutputModelCardCaptureServiceConfigurationRecord getCardCaptureServiceConfigurationRecord() {
    return cardCaptureServiceConfigurationRecord;
  }

  public void setCardCaptureServiceConfigurationRecord(SDCardCaptureConfigureOutputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord) {
    this.cardCaptureServiceConfigurationRecord = cardCaptureServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return cardCaptureServicingSessionStatus
  **/

  public String getCardCaptureServicingSessionStatus() {
    return cardCaptureServicingSessionStatus;
  }

  public void setCardCaptureServicingSessionStatus(String cardCaptureServicingSessionStatus) {
    this.cardCaptureServicingSessionStatus = cardCaptureServicingSessionStatus;
  }


}

