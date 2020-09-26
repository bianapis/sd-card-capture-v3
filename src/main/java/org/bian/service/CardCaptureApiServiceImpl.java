/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardCaptureApiServiceImpl implements CardCaptureApiService {

	public SDCardCaptureActivateOutputModel activate(SDCardCaptureActivateInputModel request){
		return JsonReader.read("activate-SDCardCaptureActivateOutputModel.json",new TypeReference<SDCardCaptureActivateOutputModel>(){});
	}
	
	public SDCardCaptureConfigureOutputModel configure(String sdReferenceId, SDCardCaptureConfigureInputModel request){
		return JsonReader.read("configure-SDCardCaptureConfigureOutputModel.json",new TypeReference<SDCardCaptureConfigureOutputModel>(){});
	}
	
	public BQTransactionConsolidationControlOutputModel controlTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationControlInputModel request){
		return JsonReader.read("control-BQTransactionConsolidationControlOutputModel.json",new TypeReference<BQTransactionConsolidationControlOutputModel>(){});
	}
	
	public CRCreditCardFinancialCaptureTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionControlInputModel request){
		return JsonReader.read("control-CRCreditCardFinancialCaptureTransactionControlOutputModel.json",new TypeReference<CRCreditCardFinancialCaptureTransactionControlOutputModel>(){});
	}
	
	public BQTransactionConsolidationExchangeOutputModel exchangeTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationExchangeInputModel request){
		return JsonReader.read("exchange-BQTransactionConsolidationExchangeOutputModel.json",new TypeReference<BQTransactionConsolidationExchangeOutputModel>(){});
	}
	
	public CRCreditCardFinancialCaptureTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionExchangeInputModel request){
		return JsonReader.read("exchange-CRCreditCardFinancialCaptureTransactionExchangeOutputModel.json",new TypeReference<CRCreditCardFinancialCaptureTransactionExchangeOutputModel>(){});
	}
	
	public BQTransactionConsolidationExecuteOutputModel executeTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationExecuteInputModel request){
		return JsonReader.read("execute-BQTransactionConsolidationExecuteOutputModel.json",new TypeReference<BQTransactionConsolidationExecuteOutputModel>(){});
	}
	
	public CRCreditCardFinancialCaptureTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionExecuteInputModel request){
		return JsonReader.read("execute-CRCreditCardFinancialCaptureTransactionExecuteOutputModel.json",new TypeReference<CRCreditCardFinancialCaptureTransactionExecuteOutputModel>(){});
	}
	
	public SDCardCaptureFeedbackOutputModel feedback(String sdReferenceId, SDCardCaptureFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardCaptureFeedbackOutputModel.json",new TypeReference<SDCardCaptureFeedbackOutputModel>(){});
	}
	
	public CRCreditCardFinancialCaptureTransactionInitiateOutputModel initiate(String sdReferenceId, CRCreditCardFinancialCaptureTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRCreditCardFinancialCaptureTransactionInitiateOutputModel.json",new TypeReference<CRCreditCardFinancialCaptureTransactionInitiateOutputModel>(){});
	}
	
	public BQTransactionAuthorizationInitiateOutputModel initiateTransactionauthorization(String sdReferenceId, String crReferenceId, BQTransactionAuthorizationInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionAuthorizationInitiateOutputModel.json",new TypeReference<BQTransactionAuthorizationInitiateOutputModel>(){});
	}
	
	public BQTransactionCaptureInitiateOutputModel initiateTransactioncapture(String sdReferenceId, String crReferenceId, BQTransactionCaptureInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionCaptureInitiateOutputModel.json",new TypeReference<BQTransactionCaptureInitiateOutputModel>(){});
	}
	
	public BQTransactionConsolidationInitiateOutputModel initiateTransactionconsolidation(String sdReferenceId, String crReferenceId, BQTransactionConsolidationInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionConsolidationInitiateOutputModel.json",new TypeReference<BQTransactionConsolidationInitiateOutputModel>(){});
	}
	
	public BQTransactionReversalInitiateOutputModel initiateTransactionreversal(String sdReferenceId, String crReferenceId, BQTransactionReversalInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionReversalInitiateOutputModel.json",new TypeReference<BQTransactionReversalInitiateOutputModel>(){});
	}
	
	public CRCreditCardFinancialCaptureTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionRequestInputModel request){
		return JsonReader.read("request-CRCreditCardFinancialCaptureTransactionRequestOutputModel.json",new TypeReference<CRCreditCardFinancialCaptureTransactionRequestOutputModel>(){});
	}
	
	public CRCreditCardFinancialCaptureTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCreditCardFinancialCaptureTransactionRetrieveOutputModel.json",new TypeReference<CRCreditCardFinancialCaptureTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQTransactionAuthorizationRetrieveOutputModel retrieveTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionAuthorizationRetrieveOutputModel.json",new TypeReference<BQTransactionAuthorizationRetrieveOutputModel>(){});
	}
	
	public BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionCaptureRetrieveOutputModel.json",new TypeReference<BQTransactionCaptureRetrieveOutputModel>(){});
	}
	
	public BQTransactionConsolidationRetrieveOutputModel retrieveTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionConsolidationRetrieveOutputModel.json",new TypeReference<BQTransactionConsolidationRetrieveOutputModel>(){});
	}
	
	public BQTransactionReversalRetrieveOutputModel retrieveTransactionreversal(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionReversalRetrieveOutputModel.json",new TypeReference<BQTransactionReversalRetrieveOutputModel>(){});
	}
	
	public SDCardCaptureRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardCaptureRetrieveOutputModel.json",new TypeReference<SDCardCaptureRetrieveOutputModel>(){});
	}
	
	public CRCreditCardFinancialCaptureTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditCardFinancialCaptureTransactionUpdateInputModel request){
		return JsonReader.read("update-CRCreditCardFinancialCaptureTransactionUpdateOutputModel.json",new TypeReference<CRCreditCardFinancialCaptureTransactionUpdateOutputModel>(){});
	}
	
	public BQTransactionAuthorizationUpdateOutputModel updateTransactionauthorization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionAuthorizationUpdateInputModel request){
		return JsonReader.read("update-BQTransactionAuthorizationUpdateOutputModel.json",new TypeReference<BQTransactionAuthorizationUpdateOutputModel>(){});
	}
	
	public BQTransactionCaptureUpdateOutputModel updateTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureUpdateInputModel request){
		return JsonReader.read("update-BQTransactionCaptureUpdateOutputModel.json",new TypeReference<BQTransactionCaptureUpdateOutputModel>(){});
	}
	
	public BQTransactionConsolidationUpdateOutputModel updateTransactionconsolidation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionConsolidationUpdateInputModel request){
		return JsonReader.read("update-BQTransactionConsolidationUpdateOutputModel.json",new TypeReference<BQTransactionConsolidationUpdateOutputModel>(){});
	}
	
	public BQTransactionReversalUpdateOutputModel updateTransactionreversal(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionReversalUpdateInputModel request){
		return JsonReader.read("update-BQTransactionReversalUpdateOutputModel.json",new TypeReference<BQTransactionReversalUpdateOutputModel>(){});
	}
	
}
