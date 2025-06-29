package com.eblacorp.invest.mockup.moi.rest.response;

import com.eblacorp.invest.mockup.moi.enums.ApplicantTypeEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReceiveRealestateApplicationResponse {


    private String processStatusCode;
    private String processStatusDescArb;
    private String processStatusDescEng;
    private String applicationNumber;
    private ApplicantTypeEnum applicantType;
    private String applicationStatusDesEn;
    private String applicationStatusDesAr;
    private String visaNumber;
    private String visaStatusDesEn;
    private String visaStatusDesAr;
    private String visaIssueDate;
    private String visaExpiryDate;
    private String aplRecieveDate;
    private String aplExpiryDate;
    private String residentQID;
    private String notesAr;
    private String notesEn;

}
