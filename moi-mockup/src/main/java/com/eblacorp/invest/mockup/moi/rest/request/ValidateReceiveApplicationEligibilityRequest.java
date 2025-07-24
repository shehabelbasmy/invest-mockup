package com.eblacorp.invest.mockup.moi.rest.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidateReceiveApplicationEligibilityRequest {

	private String appType;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expiryDate;
	private String qid;
}
