package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis;
import org.bian.dto.SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis;
import org.bian.dto.SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecord
 */
public class SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecord   {
  private SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis cardCaptureActivityAnalysis = null;

  private SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis cardCapturePerformanceAnalysis = null;

  private SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get cardCaptureActivityAnalysis
   * @return cardCaptureActivityAnalysis
  **/

  public SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis getCardCaptureActivityAnalysis() {
    return cardCaptureActivityAnalysis;
  }

  public void setCardCaptureActivityAnalysis(SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCaptureActivityAnalysis cardCaptureActivityAnalysis) {
    this.cardCaptureActivityAnalysis = cardCaptureActivityAnalysis;
  }


  /**
   * Get cardCapturePerformanceAnalysis
   * @return cardCapturePerformanceAnalysis
  **/

  public SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis getCardCapturePerformanceAnalysis() {
    return cardCapturePerformanceAnalysis;
  }

  public void setCardCapturePerformanceAnalysis(SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordCardCapturePerformanceAnalysis cardCapturePerformanceAnalysis) {
    this.cardCapturePerformanceAnalysis = cardCapturePerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCardCaptureRetrieveInputModelCardCaptureRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

