package com.eblacorp.invest.mockup.moi.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data 
@Builder
public class ResidentApplicantDetailDto {

	private String QID;
	private String nameEn;
	private String nameAr;
	private String genderCode;
	private String genderDescAr;
	private String genderDescEn;
	private String passport;
	private String residentStatusCode;
	private String residentStatusDescEn;
	private String residentStatusDescAr;
	private String residencePurposeCode;
	private String residencePurposeDescEn;
	private String residencePurposeDescAr;
	private String natCode;
	private String natDescAr;
	private String natDescEn;
	private String dateOfBirth;
	private String profCode;
	private String profDescAr;
	private String profDescEn;
	private String residenceStartDate;
	private String residenceEndDate;
	private String sponsorId;
	private String sponsorNameAr;
	private String sponsorNameEn;
	private String sponsorRelationCode;
	private String sponsorRelationDescEn;
	private String sponsorRelationDescAr;

	private List<String> applicationNumber;
	private List<String> applicationType;
	private List<String> applicationTypeDescArb;
	private List<String> applicationTypeDescEng;

	private String remarksArb;
	private String remarksEng;
	private String allowedToCancel;
	private Boolean hasSponsoredVisasOrQids;
}
