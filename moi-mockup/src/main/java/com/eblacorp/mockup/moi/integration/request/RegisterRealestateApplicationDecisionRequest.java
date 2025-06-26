package com.eblacorp.mockup.moi.integration.request;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.eblacorp.mockup.moi.dto.MoiApplicationDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@ToString
public class RegisterRealestateApplicationDecisionRequest {
    
	@Valid
	@NotNull
	private MoiApplicationDto moiApplication;
    
}
