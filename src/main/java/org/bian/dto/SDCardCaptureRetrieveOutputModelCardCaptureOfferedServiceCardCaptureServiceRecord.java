package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecordCardCaptureServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecord
 */
public class SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecord   {
  private String cardCaptureServiceType = null;

  private String cardCaptureServiceVersion = null;

  private String cardCaptureServiceDescription = null;

  private SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecordCardCaptureServicePoliciesandGuidelines cardCaptureServicePoliciesandGuidelines = null;

  private String cardCaptureServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return cardCaptureServiceType
  **/

  public String getCardCaptureServiceType() {
    return cardCaptureServiceType;
  }

  public void setCardCaptureServiceType(String cardCaptureServiceType) {
    this.cardCaptureServiceType = cardCaptureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return cardCaptureServiceVersion
  **/

  public String getCardCaptureServiceVersion() {
    return cardCaptureServiceVersion;
  }

  public void setCardCaptureServiceVersion(String cardCaptureServiceVersion) {
    this.cardCaptureServiceVersion = cardCaptureServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return cardCaptureServiceDescription
  **/

  public String getCardCaptureServiceDescription() {
    return cardCaptureServiceDescription;
  }

  public void setCardCaptureServiceDescription(String cardCaptureServiceDescription) {
    this.cardCaptureServiceDescription = cardCaptureServiceDescription;
  }


  /**
   * Get cardCaptureServicePoliciesandGuidelines
   * @return cardCaptureServicePoliciesandGuidelines
  **/

  public SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecordCardCaptureServicePoliciesandGuidelines getCardCaptureServicePoliciesandGuidelines() {
    return cardCaptureServicePoliciesandGuidelines;
  }

  public void setCardCaptureServicePoliciesandGuidelines(SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecordCardCaptureServicePoliciesandGuidelines cardCaptureServicePoliciesandGuidelines) {
    this.cardCaptureServicePoliciesandGuidelines = cardCaptureServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return cardCaptureServiceSchedule
  **/

  public String getCardCaptureServiceSchedule() {
    return cardCaptureServiceSchedule;
  }

  public void setCardCaptureServiceSchedule(String cardCaptureServiceSchedule) {
    this.cardCaptureServiceSchedule = cardCaptureServiceSchedule;
  }


}

