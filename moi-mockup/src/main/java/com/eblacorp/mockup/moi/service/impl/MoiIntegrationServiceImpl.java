package com.eblacorp.mockup.moi.service.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eblacorp.mockup.moi.entity.MoiApplication;
import com.eblacorp.mockup.moi.integration.clients.MojInvestClient;
import com.eblacorp.mockup.moi.rest.request.CancelRealestateApplicationRequest;
import com.eblacorp.mockup.moi.rest.request.GetRealestateApplicationsRequest;
import com.eblacorp.mockup.moi.rest.request.GetResidencyRevokeApplicationsRequest;
import com.eblacorp.mockup.moi.rest.request.GetResidentsWithRealEstatePrivilegeRequest;
import com.eblacorp.mockup.moi.rest.request.ReceiveRealestateApplicationRequest;
import com.eblacorp.mockup.moi.rest.request.RegisterPropertyTitleDeedRequest;
import com.eblacorp.mockup.moi.rest.request.RegisterQidRealEstatePrivilegesRequest;
import com.eblacorp.mockup.moi.rest.request.RegisterResidencyRevokeApplicationRequest;
import com.eblacorp.mockup.moi.rest.request.ValidateReceiveApplicationEligibilityRequest;
import com.eblacorp.mockup.moi.rest.response.CancelRealestateApplicationResponse;
import com.eblacorp.mockup.moi.rest.response.GetRealestateApplicationsResponse;
import com.eblacorp.mockup.moi.rest.response.GetResidencyRevokeApplicationsResponse;
import com.eblacorp.mockup.moi.rest.response.GetResidentsWithRealEstatePrivilegeResponse;
import com.eblacorp.mockup.moi.rest.response.ReceiveRealestateApplicationResponse;
import com.eblacorp.mockup.moi.rest.response.RegisterPropertyTitleDeedResponse;
import com.eblacorp.mockup.moi.rest.response.RegisterQidRealEstatePrivilegesResponse;
import com.eblacorp.mockup.moi.rest.response.RegisterResidencyRevokeApplicationResponse;
import com.eblacorp.mockup.moi.rest.response.ValidateReceiveApplicationEligibilityResponse;
import com.eblacorp.mockup.moi.service.MoiIntegrationService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MoiIntegrationServiceImpl implements MoiIntegrationService {
	
	@Autowired
	private final EntityManager entityManager;
	
	@Autowired
	private final MojInvestClient mojInvestClient;
	
	@Override
	public ValidateReceiveApplicationEligibilityResponse validateReceiveApplicationEligibility(
			ValidateReceiveApplicationEligibilityRequest request) {
		MoiApplication find = entityManager.find(MoiApplication.class, 1l);
		return null;
	}

	@Override
	public ReceiveRealestateApplicationResponse receiveRealestateApplication(
			ReceiveRealestateApplicationRequest request) {
//		return ReceiveRealestateApplicationResponse.builder()
//			.aplExpiryDate("")
//			.aplRecieveDate(null)
//			.applicantType(null)
//			.applicationNumber("applicationNumber")
//			.applicationStatusDesAr("applicationStatusDesAr")
//			.applicationStatusDesEn("applicationStatusDesEn")
//			.notesAr("NoteAr")
//			.notesEn("NoteEn")
//			.processStatusCode("processStatusCode")
//			.processStatusDescArb("processStatusDescArb")
//			.processStatusDescEng("processStatusDescEng")
//			.visaStatusDesEn("visaStatusDesEn")
//			.visaStatusDesAr("visaStatusDesAr")
//			.visaNumber("wef927834rf")
//			.visaExpiryDate("2028-06-12")
//			.visaIssueDate("2026-06-12")
//			.residentQID(request.getResidentQID())
//			.build();
		return null;
	}

	@Override
	public CancelRealestateApplicationResponse cancelRealestateApplication(CancelRealestateApplicationRequest request) {
		return null;
	}

	@Override
	public GetRealestateApplicationsResponse getRealestateApplications(GetRealestateApplicationsRequest request) {
		return null;
	}

	@Override
	public RegisterPropertyTitleDeedResponse registerPropertyTitleDeed(RegisterPropertyTitleDeedRequest request) {
		return null;
	}

	@Override
	public RegisterQidRealEstatePrivilegesResponse registerQidRealEstatePrivileges(
			RegisterQidRealEstatePrivilegesRequest request) {
		return null;
	}

	@Override
	public GetResidentsWithRealEstatePrivilegeResponse getResidentsWithRealEstateRpOrPrivileges(
			GetResidentsWithRealEstatePrivilegeRequest request) {
		return null;
	}

	@Override
	public RegisterResidencyRevokeApplicationResponse registerResidencyRevokeApplication(
			RegisterResidencyRevokeApplicationRequest request) {
		return null;
	}

	@Override
	public GetResidencyRevokeApplicationsResponse getResidencyRevokeApplications(
			GetResidencyRevokeApplicationsRequest request) {
		return null;
	}

}
