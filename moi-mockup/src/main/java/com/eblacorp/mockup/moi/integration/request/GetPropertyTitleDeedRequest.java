package com.eblacorp.mockup.moi.integration.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class GetPropertyTitleDeedRequest {
    private String identityNumber;
    private Date identityExpiryDate;
    private Long nationalityId;
    private Byte idType;
}
