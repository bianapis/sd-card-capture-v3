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
 * SDCardCaptureConfigureOutputModelCardCaptureServiceConfigurationRecord
 */
public class SDCardCaptureConfigureOutputModelCardCaptureServiceConfigurationRecord   {
  private String cardCaptureServiceConfigurationSettingDescription = null;

  private SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup cardCaptureServiceConfigurationSetup = null;

  private SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription cardCaptureServiceSubscription = null;

  private SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement cardCaptureServiceAgreement = null;

  private String cardCaptureServiceStatus = null;


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

