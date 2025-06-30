package com.eblacorp.invest.mockup.moi.rest.request;

import java.util.Date;

import com.eblacorp.invest.mockup.moi.dto.VisaDto;
import com.eblacorp.invest.mockup.moi.enums.ApplicantTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmRecieveRealestateApplicationRequest {

	private String mojAplRefNum; // sak invest requestID
	private String moiAplRefNum; // id of moi (inside moiApplicaiton moi_application_num)
	
	private Date aplRecieveDate;

	private Date aplExpiryDate;
	
	private ApplicantTypeEnum applicantType;
	
	private String residentQID;
	
	private String applicationStatusDesEn;
	
	private String applicationStatusDesAr;
	
	private VisaDto visa;
	
	private String notesAr;
	
	private String notesEn;
}
