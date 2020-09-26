/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardCaptureApiService {

	SDCardCaptureActivateOutputModel activate(SDCardCaptureActivateInputModel request);
	
	SDCardCaptureConfigureOutputModel configure(String sdReferenceId, SDCardCaptureConfigureInputModel request);
	
	BQTransactionConsolidationControlOutputModel controlTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationControlInputModel request);
	
	CRCreditCardFinancialCaptureTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionControlInputModel request);
	
	BQTransactionConsolidationExchangeOutputModel exchangeTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationExchangeInputModel request);
	
	CRCreditCardFinancialCaptureTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionExchangeInputModel request);
	
	BQTransactionConsolidationExecuteOutputModel executeTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationExecuteInputModel request);
	
	CRCreditCardFinancialCaptureTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionExecuteInputModel request);
	
	SDCardCaptureFeedbackOutputModel feedback(String sdReferenceId, SDCardCaptureFeedbackInputModel request);
	
	CRCreditCardFinancialCaptureTransactionInitiateOutputModel initiate(String sdReferenceId, CRCreditCardFinancialCaptureTransactionInitiateInputModel request);
	
	BQTransactionAuthorizationInitiateOutputModel initiateTransactionauthorization(String sdReferenceId, String crReferenceId, BQTransactionAuthorizationInitiateInputModel request);
	
	BQTransactionCaptureInitiateOutputModel initiateTransactioncapture(String sdReferenceId, String crReferenceId, BQTransactionCaptureInitiateInputModel request);
	
	BQTransactionConsolidationInitiateOutputModel initiateTransactionconsolidation(String sdReferenceId, String crReferenceId, BQTransactionConsolidationInitiateInputModel request);
	
	BQTransactionReversalInitiateOutputModel initiateTransactionreversal(String sdReferenceId, String crReferenceId, BQTransactionReversalInitiateInputModel request);
	
	CRCreditCardFinancialCaptureTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionRequestInputModel request);
	
	CRCreditCardFinancialCaptureTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQTransactionAuthorizationRetrieveOutputModel retrieveTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTransactionConsolidationRetrieveOutputModel retrieveTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTransactionReversalRetrieveOutputModel retrieveTransactionreversal(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCardCaptureRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCreditCardFinancialCaptureTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionUpdateInputModel request);
	
	BQTransactionAuthorizationUpdateOutputModel updateTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAuthorizationUpdateInputModel request);
	
	BQTransactionCaptureUpdateOutputModel updateTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureUpdateInputModel request);
	
	BQTransactionConsolidationUpdateOutputModel updateTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationUpdateInputModel request);
	
	BQTransactionReversalUpdateOutputModel updateTransactionreversal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionReversalUpdateInputModel request);
	
}
