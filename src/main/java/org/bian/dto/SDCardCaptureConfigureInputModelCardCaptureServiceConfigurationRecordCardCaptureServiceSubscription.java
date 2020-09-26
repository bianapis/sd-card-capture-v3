package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription
 */
public class SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceSubscription   {
  private String cardCaptureServiceSubscriberReference = null;

  private String cardCaptureServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return cardCaptureServiceSubscriberReference
  **/

  public String getCardCaptureServiceSubscriberReference() {
    return cardCaptureServiceSubscriberReference;
  }

  public void setCardCaptureServiceSubscriberReference(String cardCaptureServiceSubscriberReference) {
    this.cardCaptureServiceSubscriberReference = cardCaptureServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return cardCaptureServiceSubscriberAccessProfile
  **/

  public String getCardCaptureServiceSubscriberAccessProfile() {
    return cardCaptureServiceSubscriberAccessProfile;
  }

  public void setCardCaptureServiceSubscriberAccessProfile(String cardCaptureServiceSubscriberAccessProfile) {
    this.cardCaptureServiceSubscriberAccessProfile = cardCaptureServiceSubscriberAccessProfile;
  }


}

