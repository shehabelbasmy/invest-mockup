package com.eblacorp.mockup.moi.integration.request;

import com.eblacorp.mockup.moi.dto.VisaDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CancelRealestateApplicationRequest {

	private String mojAplRefNum;
	private String moiAplRefNum;
	private String residentQID;
	private VisaDto visa;
	private String notesAr;
	private String notesEn;
}
