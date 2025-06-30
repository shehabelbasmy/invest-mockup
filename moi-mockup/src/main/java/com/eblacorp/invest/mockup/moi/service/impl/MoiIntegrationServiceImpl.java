package com.eblacorp.invest.mockup.moi.service.impl;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.eblacorp.invest.mockup.moi.entity.MoiApplication;
import com.eblacorp.invest.mockup.moi.entity.RealEstateApplication;
import com.eblacorp.invest.mockup.moi.integration.clients.MojInvestClient;
import com.eblacorp.invest.mockup.moi.repository.RealEstateApplicationReposiotry;
import com.eblacorp.invest.mockup.moi.rest.request.CancelRealestateApplicationRequest;
import com.eblacorp.invest.mockup.moi.rest.request.ConfirmRecieveRealestateApplicationRequest;
import com.eblacorp.invest.mockup.moi.rest.request.GetRealestateApplicationsRequest;
import com.eblacorp.invest.mockup.moi.rest.request.GetResidencyRevokeApplicationsRequest;
import com.eblacorp.invest.mockup.moi.rest.request.GetResidentsWithRealEstatePrivilegeRequest;
import com.eblacorp.invest.mockup.moi.rest.request.ReceiveRealestateApplicationRequest;
import com.eblacorp.invest.mockup.moi.rest.request.RegisterPropertyTitleDeedRequest;
import com.eblacorp.invest.mockup.moi.rest.request.RegisterQidRealEstatePrivilegesRequest;
import com.eblacorp.invest.mockup.moi.rest.request.RegisterResidencyRevokeApplicationRequest;
import com.eblacorp.invest.mockup.moi.rest.request.ValidateReceiveApplicationEligibilityRequest;
import com.eblacorp.invest.mockup.moi.rest.response.CancelRealestateApplicationResponse;
import com.eblacorp.invest.mockup.moi.rest.response.GetRealestateApplicationsResponse;
import com.eblacorp.invest.mockup.moi.rest.response.GetResidencyRevokeApplicationsResponse;
import com.eblacorp.invest.mockup.moi.rest.response.GetResidentsWithRealEstatePrivilegeResponse;
import com.eblacorp.invest.mockup.moi.rest.response.ReceiveRealestateApplicationResponse;
import com.eblacorp.invest.mockup.moi.rest.response.RegisterPropertyTitleDeedResponse;
import com.eblacorp.invest.mockup.moi.rest.response.RegisterQidRealEstatePrivilegesResponse;
import com.eblacorp.invest.mockup.moi.rest.response.RegisterResidencyRevokeApplicationResponse;
import com.eblacorp.invest.mockup.moi.rest.response.ValidateReceiveApplicationEligibilityResponse;
import com.eblacorp.invest.mockup.moi.service.MoiIntegrationService;
import com.eblacorp.invest.mockup.moi.util.TimerExecuter;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MoiIntegrationServiceImpl implements MoiIntegrationService {
	
	private final EntityManager entityManager;
	private final MojInvestClient mojInvestClient;
	private final RealEstateApplicationReposiotry realEstateApplicationReposiotry;
	
	@Override
	public ValidateReceiveApplicationEligibilityResponse validateReceiveApplicationEligibility(
			ValidateReceiveApplicationEligibilityRequest request) {
		MoiApplication find = entityManager.find(MoiApplication.class, 1l);
		return null;
	}

	@Override
	public ReceiveRealestateApplicationResponse receiveRealestateApplication(
			ReceiveRealestateApplicationRequest request) {
		RealEstateApplication realRestateApplication= map(request);
		TimerExecuter.executeAfter(()->{
			RealEstateApplication saved=realEstateApplicationReposiotry.save(realRestateApplication);
			ConfirmRecieveRealestateApplicationRequest recieve= map(saved);
			mojInvestClient.confirmRecieveRealestateApplication(recieve);
		});
		return ReceiveRealestateApplicationResponse.builder()
			.respCode("VHP000")
			.respArabicMsg("تم إستقبال الطلب بنجاح")
			.respEngMsg("Application is received successfully")
			.build();
	}

	private ConfirmRecieveRealestateApplicationRequest map(RealEstateApplication saved) {
		return ConfirmRecieveRealestateApplicationRequest.builder()
			.aplExpiryDate(null)
			.aplRecieveDate(null)
			.build();
	}

	private RealEstateApplication map(ReceiveRealestateApplicationRequest request) {
		
		return RealEstateApplication.builder()
				.aplRecieveDate(Date.from(Instant.now()))
				.aplExpiryDate(Date.from(ZonedDateTime.now().plusYears(1).toInstant()))
				.applicationNumber(Math.random()*10000+"")
				.applicationStatusDesAr("applicationStatusDesAr")
				.applicationStatusDesEn("applicationStatusDesEn")
				.notesAr("NoteAr")
				.notesEn("NoteEn")
				.processStatusCode("processStatusCode")
				.processStatusDescArb("processStatusDescArb")
				.processStatusDescEng("processStatusDescEng")
				.visaStatusDesEn("visaStatusDesEn")
				.visaStatusDesAr("visaStatusDesAr")
				.visaNumber((Math.random()*10000+""))
				.residentQID(request.getResidentQID())
				.build();
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
		return new RegisterResidencyRevokeApplicationResponse(
				"VHP000",
				" تم استقبال طلب سحب الإقامة العقارية ",
				"Request to revoke Real-estate Residency received successfully"
		);
	}

	@Override
	public GetResidencyRevokeApplicationsResponse getResidencyRevokeApplications(
			GetResidencyRevokeApplicationsRequest request) {
		return null;
	}

}
