/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Transact;

@BianRestController
public class CardCaptureApiController {

	@Autowired
	CardCaptureApiService service;
	
	@Transact.Activate
	public BianResponse<SDCardCaptureActivateOutputModel> activate(@RequestBody BianRequest<SDCardCaptureActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Transact.Configure
	public BianResponse<SDCardCaptureConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardCaptureConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionconsolidation")
	@Transact.Control
	public BianResponse<BQTransactionConsolidationControlOutputModel> controlTransactionconsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionConsolidationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlTransactionconsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Control
	public BianResponse<CRCreditCardFinancialCaptureTransactionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditCardFinancialCaptureTransactionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionconsolidation")
	@Transact.Exchange
	public BianResponse<BQTransactionConsolidationExchangeOutputModel> exchangeTransactionconsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionConsolidationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeTransactionconsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Exchange
	public BianResponse<CRCreditCardFinancialCaptureTransactionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditCardFinancialCaptureTransactionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionconsolidation")
	@Transact.Execute
	public BianResponse<BQTransactionConsolidationExecuteOutputModel> executeTransactionconsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionConsolidationExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeTransactionconsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Execute
	public BianResponse<CRCreditCardFinancialCaptureTransactionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditCardFinancialCaptureTransactionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Feedback
	public BianResponse<SDCardCaptureFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCardCaptureFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Initiate
	public BianResponse<CRCreditCardFinancialCaptureTransactionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCreditCardFinancialCaptureTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionauthorization")
	@Transact.Initiate
	public BianResponse<BQTransactionAuthorizationInitiateOutputModel> initiateTransactionauthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionAuthorizationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTransactionauthorization(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactioncapture")
	@Transact.Initiate
	public BianResponse<BQTransactionCaptureInitiateOutputModel> initiateTransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionCaptureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTransactioncapture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionconsolidation")
	@Transact.Initiate
	public BianResponse<BQTransactionConsolidationInitiateOutputModel> initiateTransactionconsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionConsolidationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTransactionconsolidation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionreversal")
	@Transact.Initiate
	public BianResponse<BQTransactionReversalInitiateOutputModel> initiateTransactionreversal(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQTransactionReversalInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateTransactionreversal(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Request
	public BianResponse<CRCreditCardFinancialCaptureTransactionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditCardFinancialCaptureTransactionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Retrieve
	public BianResponse<CRCreditCardFinancialCaptureTransactionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Transact.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Transact.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Transact.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("transactionauthorization")
	@Transact.Retrieve
	public BianResponse<BQTransactionAuthorizationRetrieveOutputModel> retrieveTransactionauthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactionauthorization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("transactioncapture")
	@Transact.Retrieve
	public BianResponse<BQTransactionCaptureRetrieveOutputModel> retrieveTransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactioncapture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("transactionconsolidation")
	@Transact.Retrieve
	public BianResponse<BQTransactionConsolidationRetrieveOutputModel> retrieveTransactionconsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactionconsolidation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("transactionreversal")
	@Transact.Retrieve
	public BianResponse<BQTransactionReversalRetrieveOutputModel> retrieveTransactionreversal(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactionreversal(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveSD
	public BianResponse<SDCardCaptureRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Transact.Update
	public BianResponse<CRCreditCardFinancialCaptureTransactionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditCardFinancialCaptureTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionauthorization")
	@Transact.Update
	public BianResponse<BQTransactionAuthorizationUpdateOutputModel> updateTransactionauthorization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionAuthorizationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactionauthorization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactioncapture")
	@Transact.Update
	public BianResponse<BQTransactionCaptureUpdateOutputModel> updateTransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionCaptureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionconsolidation")
	@Transact.Update
	public BianResponse<BQTransactionConsolidationUpdateOutputModel> updateTransactionconsolidation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionConsolidationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactionconsolidation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactionreversal")
	@Transact.Update
	public BianResponse<BQTransactionReversalUpdateOutputModel> updateTransactionreversal(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionReversalUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactionreversal(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
