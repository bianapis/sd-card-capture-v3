package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement
 */
public class SDCardCaptureActivateOutputModelCardCaptureServiceConfigurationRecordCardCaptureServiceAgreement   {
  private String cardCaptureServiceAgreementReference = null;

  private String cardCaptureServiceUserReference = null;

  private String cardCaptureServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return cardCaptureServiceAgreementReference
  **/

  public String getCardCaptureServiceAgreementReference() {
    return cardCaptureServiceAgreementReference;
  }

  public void setCardCaptureServiceAgreementReference(String cardCaptureServiceAgreementReference) {
    this.cardCaptureServiceAgreementReference = cardCaptureServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return cardCaptureServiceUserReference
  **/

  public String getCardCaptureServiceUserReference() {
    return cardCaptureServiceUserReference;
  }

  public void setCardCaptureServiceUserReference(String cardCaptureServiceUserReference) {
    this.cardCaptureServiceUserReference = cardCaptureServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return cardCaptureServiceAgreementTermsandConditions
  **/

  public String getCardCaptureServiceAgreementTermsandConditions() {
    return cardCaptureServiceAgreementTermsandConditions;
  }

  public void setCardCaptureServiceAgreementTermsandConditions(String cardCaptureServiceAgreementTermsandConditions) {
    this.cardCaptureServiceAgreementTermsandConditions = cardCaptureServiceAgreementTermsandConditions;
  }


}

