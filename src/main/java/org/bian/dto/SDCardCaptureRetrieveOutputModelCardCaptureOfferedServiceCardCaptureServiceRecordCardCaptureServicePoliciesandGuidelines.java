package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecordCardCaptureServicePoliciesandGuidelines
 */
public class SDCardCaptureRetrieveOutputModelCardCaptureOfferedServiceCardCaptureServiceRecordCardCaptureServicePoliciesandGuidelines   {
  private String cardCaptureServiceEligibility = null;

  private String cardCaptureServiceIntendedUses = null;

  private String cardCaptureServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return cardCaptureServiceEligibility
  **/

  public String getCardCaptureServiceEligibility() {
    return cardCaptureServiceEligibility;
  }

  public void setCardCaptureServiceEligibility(String cardCaptureServiceEligibility) {
    this.cardCaptureServiceEligibility = cardCaptureServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return cardCaptureServiceIntendedUses
  **/

  public String getCardCaptureServiceIntendedUses() {
    return cardCaptureServiceIntendedUses;
  }

  public void setCardCaptureServiceIntendedUses(String cardCaptureServiceIntendedUses) {
    this.cardCaptureServiceIntendedUses = cardCaptureServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return cardCaptureServicePricingandTerms
  **/

  public String getCardCaptureServicePricingandTerms() {
    return cardCaptureServicePricingandTerms;
  }

  public void setCardCaptureServicePricingandTerms(String cardCaptureServicePricingandTerms) {
    this.cardCaptureServicePricingandTerms = cardCaptureServicePricingandTerms;
  }


}

