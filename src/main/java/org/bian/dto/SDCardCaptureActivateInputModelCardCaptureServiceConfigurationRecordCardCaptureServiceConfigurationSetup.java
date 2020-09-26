package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup
 */
public class SDCardCaptureActivateInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup   {
  private String cardCaptureServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return cardCaptureServiceConfigurationParameter
  **/

  public String getCardCaptureServiceConfigurationParameter() {
    return cardCaptureServiceConfigurationParameter;
  }

  public void setCardCaptureServiceConfigurationParameter(String cardCaptureServiceConfigurationParameter) {
    this.cardCaptureServiceConfigurationParameter = cardCaptureServiceConfigurationParameter;
  }


}

