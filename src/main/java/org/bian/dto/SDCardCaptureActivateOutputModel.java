package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCardCaptureActivateOutputModel
 */
public class SDCardCaptureActivateOutputModel   {
  private String cardCaptureActivationActionTaskReference = null;

  private Object cardCaptureActivationActionTaskRecord = null;

  private String cardCaptureServicingSessionReference = null;

  private Object cardCaptureServicingSessionRecord = null;

  private SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord = null;

  private String cardCaptureServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return cardCaptureActivationActionTaskReference
  **/

  public String getCardCaptureActivationActionTaskReference() {
    return cardCaptureActivationActionTaskReference;
  }

  public void setCardCaptureActivationActionTaskReference(String cardCaptureActivationActionTaskReference) {
    this.cardCaptureActivationActionTaskReference = cardCaptureActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return cardCaptureServicingSessionRecord
  **/

  public Object getCardCaptureServicingSessionRecord() {
    return cardCaptureServicingSessionRecord;
  }

  public void setCardCaptureServicingSessionRecord(Object cardCaptureServicingSessionRecord) {
    this.cardCaptureServicingSessionRecord = cardCaptureServicingSessionRecord;
  }


  /**
   * Get cardCaptureServiceConfigurationRecord
   * @return cardCaptureServiceConfigurationRecord
  **/

  public SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecord getCardCaptureServiceConfigurationRecord() {
    return cardCaptureServiceConfigurationRecord;
  }

  public void setCardCaptureServiceConfigurationRecord(SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecord cardCaptureServiceConfigurationRecord) {
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

