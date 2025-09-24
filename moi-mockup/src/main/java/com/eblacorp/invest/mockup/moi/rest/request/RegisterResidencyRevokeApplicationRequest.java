package com.eblacorp.invest.mockup.moi.rest.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterResidencyRevokeApplicationRequest implements Serializable {

    private String mojAplRefNum;
    private String actionType;
    private String moiRevokeAplRefNumber;
    private String residentQID;
    private String remarksEng;
    private String remarksArb;
    private String gracePeriodEndDate;
}
