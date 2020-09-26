package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecord
 */
public class SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecord   {
  private String cardCaptureServiceConfigurationSettingReference = null;

  private String cardCaptureServiceConfigurationSettingType = null;

  private SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup cardCaptureServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return cardCaptureServiceConfigurationSettingReference
  **/

  public String getCardCaptureServiceConfigurationSettingReference() {
    return cardCaptureServiceConfigurationSettingReference;
  }

  public void setCardCaptureServiceConfigurationSettingReference(String cardCaptureServiceConfigurationSettingReference) {
    this.cardCaptureServiceConfigurationSettingReference = cardCaptureServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return cardCaptureServiceConfigurationSettingType
  **/

  public String getCardCaptureServiceConfigurationSettingType() {
    return cardCaptureServiceConfigurationSettingType;
  }

  public void setCardCaptureServiceConfigurationSettingType(String cardCaptureServiceConfigurationSettingType) {
    this.cardCaptureServiceConfigurationSettingType = cardCaptureServiceConfigurationSettingType;
  }


  /**
   * Get cardCaptureServiceConfigurationSetup
   * @return cardCaptureServiceConfigurationSetup
  **/

  public SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup getCardCaptureServiceConfigurationSetup() {
    return cardCaptureServiceConfigurationSetup;
  }

  public void setCardCaptureServiceConfigurationSetup(SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup cardCaptureServiceConfigurationSetup) {
    this.cardCaptureServiceConfigurationSetup = cardCaptureServiceConfigurationSetup;
  }


}

