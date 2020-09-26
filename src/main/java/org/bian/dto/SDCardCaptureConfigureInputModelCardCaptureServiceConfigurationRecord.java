package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement;
import org.bian.dto.SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup;
import org.bian.dto.SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecord
 */
public class SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecord   {
  private String cardCaptureServiceConfigurationSettingReference = null;

  private String cardCaptureServiceConfigurationSettingType = null;

  private SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup cardCaptureServiceConfigurationSetup = null;

  private SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription cardCaptureServiceSubscription = null;

  private SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement cardCaptureServiceAgreement = null;


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

  public SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup getCardCaptureServiceConfigurationSetup() {
    return cardCaptureServiceConfigurationSetup;
  }

  public void setCardCaptureServiceConfigurationSetup(SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup cardCaptureServiceConfigurationSetup) {
    this.cardCaptureServiceConfigurationSetup = cardCaptureServiceConfigurationSetup;
  }


  /**
   * Get cardCaptureServiceSubscription
   * @return cardCaptureServiceSubscription
  **/

  public SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription getCardCaptureServiceSubscription() {
    return cardCaptureServiceSubscription;
  }

  public void setCardCaptureServiceSubscription(SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription cardCaptureServiceSubscription) {
    this.cardCaptureServiceSubscription = cardCaptureServiceSubscription;
  }


  /**
   * Get cardCaptureServiceAgreement
   * @return cardCaptureServiceAgreement
  **/

  public SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement getCardCaptureServiceAgreement() {
    return cardCaptureServiceAgreement;
  }

  public void setCardCaptureServiceAgreement(SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement cardCaptureServiceAgreement) {
    this.cardCaptureServiceAgreement = cardCaptureServiceAgreement;
  }


}

