package com.eblacorp.mockup.moi.integration.request;

import java.time.LocalDate;

import com.eblacorp.mockup.moi.dto.VisaDto;
import com.eblacorp.mockup.moi.enums.ApplicantTypeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@NoArgsConstructor//confirm
@Builder
public class RecieveRealestateApplicationRequest {

	
	private String mojAplRefNum; // sak invest requestID
	private String moiAplRefNum; // id of moi (inside moiApplicaiton moi_application_num)
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate aplRecieveDate;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate aplExpiryDate;
	
	private ApplicantTypeEnum applicantType;
	
	private String residentQID;
	
	private String applicationStatusDesEn;
	
	private String applicationStatusDesAr;
	
	private VisaDto visa;
	
	private String notesAr;
	
	private String notesEn;
}
