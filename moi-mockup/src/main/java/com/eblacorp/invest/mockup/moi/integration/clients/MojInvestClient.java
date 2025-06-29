package com.eblacorp.invest.mockup.moi.integration.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.eblacorp.invest.mockup.moi.integration.request.CancelRealestateApplicationRequest;
import com.eblacorp.invest.mockup.moi.integration.request.GetPropertyTitleDeedRequest;
import com.eblacorp.invest.mockup.moi.integration.request.RecieveRealestateApplicationRequest;
import com.eblacorp.invest.mockup.moi.integration.request.RegisterPropertyTitleDeedRequest;
import com.eblacorp.invest.mockup.moi.integration.request.RegisterQidRealEstatePrivilegesRequest;
import com.eblacorp.invest.mockup.moi.integration.request.RegisterRealEstateVisaChangeRequest;
import com.eblacorp.invest.mockup.moi.integration.request.RegisterRealestateApplicationDecisionRequest;
import com.eblacorp.invest.mockup.moi.integration.request.RegisterResidentPurposeChangeRequest;
import com.eblacorp.invest.mockup.moi.integration.request.ResidencyRevokeApplicationRequest;
import com.eblacorp.invest.mockup.moi.integration.response.CancelRealestateApplicationResponse;
import com.eblacorp.invest.mockup.moi.integration.response.GetPropertyTitleDeedResponse;
import com.eblacorp.invest.mockup.moi.integration.response.RecieveRealestateApplicationResponse;
import com.eblacorp.invest.mockup.moi.integration.response.RegisterPropertyTitleDeedResponse;
import com.eblacorp.invest.mockup.moi.integration.response.RegisterQidRealEstatePrivilegesResponse;
import com.eblacorp.invest.mockup.moi.integration.response.RegisterRealEstateVisaChangeResponse;
import com.eblacorp.invest.mockup.moi.integration.response.RegisterRealestateApplicationDecisionResponse;
import com.eblacorp.invest.mockup.moi.integration.response.RegisterResidentPurposeChangeResponse;
import com.eblacorp.invest.mockup.moi.integration.response.ResidencyRevokeApplicationResponse;
import com.eblacorp.invest.mockup.moi.rest.response.RestResponse;

@FeignClient(url = "${integration.moi.invest}",value ="MojInvestClient")
public interface MojInvestClient {

	@PostMapping("/registerRealestateApplicationDecision")
	RestResponse<RegisterRealestateApplicationDecisionResponse> registerRealestateApplicationDecision(@RequestBody RegisterRealestateApplicationDecisionRequest reuest);
	
	@PostMapping("/registerResidentPurposeChange")
	RestResponse<RegisterResidentPurposeChangeResponse> registerResidentPurposeChange(@RequestBody RegisterResidentPurposeChangeRequest reuest);
	
	@PostMapping("/registerRealEstateVisaChange")
	RestResponse<RegisterRealEstateVisaChangeResponse> registerRealEstateVisaChange(@RequestBody RegisterRealEstateVisaChangeRequest reuest);
	
	@PostMapping("/getPropertyTitleDeed")
	RestResponse<GetPropertyTitleDeedResponse> getPropertyTitleDeed(@RequestBody GetPropertyTitleDeedRequest reuest);
	
	@PutMapping("/confirmRecieveRealestateApplication")
	RestResponse<RecieveRealestateApplicationResponse> confirmRecieveRealestateApplication(@RequestBody RecieveRealestateApplicationRequest reuest);
	
	@PutMapping("/confirmCancelRealestateApplication")
	RestResponse<CancelRealestateApplicationResponse> confirmCancelRealestateApplication(@RequestBody CancelRealestateApplicationRequest reuest);
	
	@PutMapping("/confirmRegisterPropertyTitleDeed")
	RestResponse<RegisterPropertyTitleDeedResponse> confirmRegisterPropertyTitleDeed(@RequestBody RegisterPropertyTitleDeedRequest reuest);
	
	@PutMapping("/confirmResidencyRevokeApplication")
	RestResponse<ResidencyRevokeApplicationResponse> confirmResidencyRevokeApplication(@RequestBody ResidencyRevokeApplicationRequest reuest);

	@PutMapping("/confirmRegisterQidRealEstatePrivileges")
	RestResponse<RegisterQidRealEstatePrivilegesResponse> confirmRegisterQidRealEstatePrivileges(@RequestBody RegisterQidRealEstatePrivilegesRequest reuest);
}
