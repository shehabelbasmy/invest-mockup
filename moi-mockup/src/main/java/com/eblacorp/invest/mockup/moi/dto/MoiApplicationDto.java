package com.eblacorp.invest.mockup.moi.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.eblacorp.invest.mockup.moi.enums.ApplicantTypeEnum;
import com.eblacorp.invest.mockup.moi.enums.MoiDecisionCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MoiApplicationDto{

	@JsonIgnore
	private Long id;
	
	@NotBlank
	private String mojAplRefNum;
	
	@NotBlank
    private String moiAplRefNum;
	
	@NotBlank
    private ApplicantTypeEnum applicantType;
	
	@NotBlank
    private MoiDecisionCode applicationFinalDecisionCode;//moiApplicationfinalDescicion
	
	@NotNull
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate securityCheckExpiryDate;
	
	private Long qid;
	
	private String applicationStatusAr;

	private String applicationStatusEn;
	
	private VisaDto visa;
	
    //optional fields
    private String finalDecisionArabicNotes;
    private String finalDecisionEnglishNotes;
    private String ceidDecision;
    private String ceidArabicNotes;
    private String ceidEnglishNotes;
    private String ssbDecision;
    private String ssbArabicNotes;
    private String ssbEnglishNotes;
    private String torDecision;
    private String torArabicNotes;
    private String torEnglishNotes;
	
}
