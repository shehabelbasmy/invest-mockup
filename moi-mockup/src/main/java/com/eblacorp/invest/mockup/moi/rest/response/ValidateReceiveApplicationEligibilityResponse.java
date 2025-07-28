package com.eblacorp.invest.mockup.moi.rest.response;

import java.util.Collections;
import java.util.List;

import com.eblacorp.invest.mockup.moi.dto.RequiredDocumentDto;
import com.eblacorp.invest.mockup.moi.dto.ResidentApplicantDetailDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidateReceiveApplicationEligibilityResponse {

	private String respArabicMsg;
    private String respCode;
    private String respEngMsg;
    private String applicantType;
    private String allowedToApply;
    private String applicantTypeDesAr;
    private String applicantTypeDesEn;
    private String notesAr;
    private String notesEn;
    @Builder.Default
    private List<RequiredDocumentDto> applicationRequiredDocuments=Collections.emptyList();
    @Builder.Default
    private ResidentApplicantDetailDto residentApplicantDetail=new ResidentApplicantDetailDto();
}
