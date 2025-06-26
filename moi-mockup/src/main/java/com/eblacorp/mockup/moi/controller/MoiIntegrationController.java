package com.eblacorp.mockup.moi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eblacorp.mockup.moi.rest.request.CancelRealestateApplicationRequest;
import com.eblacorp.mockup.moi.rest.request.GetRealestateApplicationsRequest;
import com.eblacorp.mockup.moi.rest.request.GetResidencyRevokeApplicationsRequest;
import com.eblacorp.mockup.moi.rest.request.GetResidentsWithRealEstatePrivilegeRequest;
import com.eblacorp.mockup.moi.rest.request.ReceiveRealestateApplicationRequest;
import com.eblacorp.mockup.moi.rest.request.RegisterPropertyTitleDeedRequest;
import com.eblacorp.mockup.moi.rest.request.RegisterQidRealEstatePrivilegesRequest;
import com.eblacorp.mockup.moi.rest.request.RegisterResidencyRevokeApplicationRequest;
import com.eblacorp.mockup.moi.rest.request.ValidateReceiveApplicationEligibilityRequest;
import com.eblacorp.mockup.moi.service.MoiIntegrationService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/moi")
public class MoiIntegrationController {
	
	private MoiIntegrationService moiIntegrationService;
	
	@PostMapping("/validateReceiveApplicationEligibility")
	public ResponseEntity<?> validateReceiveApplicationEligibility(@RequestBody ValidateReceiveApplicationEligibilityRequest request){
		return ResponseEntity.ok(moiIntegrationService.validateReceiveApplicationEligibility(request));
	}
	
	@PostMapping("/receiveRealestateApplication")
	public ResponseEntity<?> receiveRealestateApplication(@RequestBody ReceiveRealestateApplicationRequest request){
		return ResponseEntity.ok(moiIntegrationService.receiveRealestateApplication(request));
	}
	
	@PostMapping("/cancelRealestateApplication")
	public ResponseEntity<?> cancelRealestateApplication(@RequestBody CancelRealestateApplicationRequest request){
		return ResponseEntity.ok(moiIntegrationService.cancelRealestateApplication(request));
	}
	
	@PostMapping("/getRealestateApplications")
	public ResponseEntity<?> getRealestateApplications(@RequestBody GetRealestateApplicationsRequest request){
		return ResponseEntity.ok(moiIntegrationService.getRealestateApplications(request));
	}
	
	@PostMapping("/registerPropertyTitleDeed")
	public ResponseEntity<?> registerPropertyTitleDeed(@RequestBody RegisterPropertyTitleDeedRequest request){
		return ResponseEntity.ok(moiIntegrationService.registerPropertyTitleDeed(request));
	}
	
	@PostMapping("/registerQidRealEstatePrivileges")
	public ResponseEntity<?> registerQidRealEstatePrivileges(@RequestBody RegisterQidRealEstatePrivilegesRequest request){
		return ResponseEntity.ok(moiIntegrationService.registerQidRealEstatePrivileges(request));
	}
	@PostMapping("/getResidentsWithRealEstateRpOrPrivileges")
	public ResponseEntity<?> getResidentsWithRealEstateRpOrPrivileges(@RequestBody GetResidentsWithRealEstatePrivilegeRequest request){
		return ResponseEntity.ok(moiIntegrationService.getResidentsWithRealEstateRpOrPrivileges(request));
	}
	@PostMapping("/registerResidencyRevokeApplication")
	public ResponseEntity<?> registerResidencyRevokeApplication(@RequestBody RegisterResidencyRevokeApplicationRequest request){
		return ResponseEntity.ok(moiIntegrationService.registerResidencyRevokeApplication(request));
	}
	@PostMapping("/getResidencyRevokeApplications")
	public ResponseEntity<?> getResidencyRevokeApplications(@RequestBody GetResidencyRevokeApplicationsRequest request){
		return ResponseEntity.ok(moiIntegrationService.getResidencyRevokeApplications(request));
	}
}
