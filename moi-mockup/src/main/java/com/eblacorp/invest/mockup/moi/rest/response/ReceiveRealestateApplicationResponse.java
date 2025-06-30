package com.eblacorp.invest.mockup.moi.rest.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReceiveRealestateApplicationResponse {
	
	private String respCode;
	private String respArabicMsg;
	private String respEngMsg;

}
