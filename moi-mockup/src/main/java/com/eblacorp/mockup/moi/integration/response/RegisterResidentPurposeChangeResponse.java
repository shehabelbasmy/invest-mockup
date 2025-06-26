package com.eblacorp.mockup.moi.integration.response;

import com.eblacorp.mockup.moi.dto.ApplicationPrivilegesDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResidentPurposeChangeResponse {

	private ApplicationPrivilegesDto applicationPrivileges;
}
