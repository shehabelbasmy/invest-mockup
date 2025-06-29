package com.eblacorp.invest.mockup.moi.dto;

import javax.validation.constraints.NotBlank;

import com.eblacorp.invest.mockup.moi.enums.ApplicantTypeEnum;
import com.eblacorp.invest.mockup.moi.enums.MoiDecisionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationPrivilegesDto{

	@JsonIgnore
	private Long id;
	@NotBlank
	private String moiAplRefNum;
	@NotBlank
    private ApplicantTypeEnum applicantType;
	@NotBlank
    private String residentQID;
	@NotBlank
    private MoiDecisionCode applicationDecisionCode;
	
	private String arabicNotes;
	private String englishNotes;
	
	
    
    private String passportNumber;
    private String nationalityId;
    private String visaNumber;
}
