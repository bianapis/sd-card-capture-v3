package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup
 */
public class SDCardCaptureConfigureInputModelCardCaptureServiceConfigurationRecordCardCaptureServiceConfigurationSetup   {
  private String cardCaptureServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return cardCaptureServiceConfigurationParameter
  **/

  public String getCardCaptureServiceConfigurationParameter() {
    return cardCaptureServiceConfigurationParameter;
  }

  public void setCardCaptureServiceConfigurationParameter(String cardCaptureServiceConfigurationParameter) {
    this.cardCaptureServiceConfigurationParameter = cardCaptureServiceConfigurationParameter;
  }


}

