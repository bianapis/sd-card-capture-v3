package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis;
import org.bian.dto.SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis;
import org.bian.dto.SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecord
 */
public class SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecord   {
  private SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis cardCaptureActivityAnalysis = null;

  private SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis cardCapturePerformanceAnalysis = null;

  private SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get cardCaptureActivityAnalysis
   * @return cardCaptureActivityAnalysis
  **/

  public SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis getCardCaptureActivityAnalysis() {
    return cardCaptureActivityAnalysis;
  }

  public void setCardCaptureActivityAnalysis(SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis cardCaptureActivityAnalysis) {
    this.cardCaptureActivityAnalysis = cardCaptureActivityAnalysis;
  }


  /**
   * Get cardCapturePerformanceAnalysis
   * @return cardCapturePerformanceAnalysis
  **/

  public SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis getCardCapturePerformanceAnalysis() {
    return cardCapturePerformanceAnalysis;
  }

  public void setCardCapturePerformanceAnalysis(SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis cardCapturePerformanceAnalysis) {
    this.cardCapturePerformanceAnalysis = cardCapturePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCardCaptureRetrieveOutputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

