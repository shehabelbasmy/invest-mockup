package com.eblacorp.mockup.moi.integration.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterPropertyTitleDeedResponse {

	private String responseCode;
	
	private String responseMessageAr;

	private String responseMessageEn;
}
