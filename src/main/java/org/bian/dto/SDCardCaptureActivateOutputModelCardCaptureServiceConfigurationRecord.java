package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup;
import org.bian.dto.SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement;
import org.bian.dto.SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecord
 */
public class SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecord   {
  private String cardCaptureServiceConfigurationSettingReference = null;

  private String cardCaptureServiceConfigurationSettingDescription = null;

  private SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup cardCaptureServiceConfigurationSetup = null;

  private SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription cardCaptureServiceSubscription = null;

  private SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement cardCaptureServiceAgreement = null;

  private String cardCaptureServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return cardCaptureServiceConfigurationSettingDescription
  **/

  public String getCardCaptureServiceConfigurationSettingDescription() {
    return cardCaptureServiceConfigurationSettingDescription;
  }

  public void setCardCaptureServiceConfigurationSettingDescription(String cardCaptureServiceConfigurationSettingDescription) {
    this.cardCaptureServiceConfigurationSettingDescription = cardCaptureServiceConfigurationSettingDescription;
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


  /**
   * Get cardCaptureServiceSubscription
   * @return cardCaptureServiceSubscription
  **/

  public SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription getCardCaptureServiceSubscription() {
    return cardCaptureServiceSubscription;
  }

  public void setCardCaptureServiceSubscription(SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription cardCaptureServiceSubscription) {
    this.cardCaptureServiceSubscription = cardCaptureServiceSubscription;
  }


  /**
   * Get cardCaptureServiceAgreement
   * @return cardCaptureServiceAgreement
  **/

  public SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement getCardCaptureServiceAgreement() {
    return cardCaptureServiceAgreement;
  }

  public void setCardCaptureServiceAgreement(SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement cardCaptureServiceAgreement) {
    this.cardCaptureServiceAgreement = cardCaptureServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return cardCaptureServiceStatus
  **/

  public String getCardCaptureServiceStatus() {
    return cardCaptureServiceStatus;
  }

  public void setCardCaptureServiceStatus(String cardCaptureServiceStatus) {
    this.cardCaptureServiceStatus = cardCaptureServiceStatus;
  }


}

