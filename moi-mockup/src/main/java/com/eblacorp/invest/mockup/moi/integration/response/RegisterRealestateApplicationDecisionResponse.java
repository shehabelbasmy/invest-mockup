package com.eblacorp.invest.mockup.moi.integration.response;

import com.eblacorp.invest.mockup.moi.dto.MoiApplicationDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterRealestateApplicationDecisionResponse {

	private MoiApplicationDto moiApplication;
}
