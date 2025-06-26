package com.eblacorp.mockup.moi.integration.response;

import java.util.List;

import com.eblacorp.mockup.moi.dto.BeneficiaryFlatDto;
import com.eblacorp.mockup.moi.dto.BeneficiaryParcelDto;
import com.eblacorp.mockup.moi.dto.OwnershipFlatDto;
import com.eblacorp.mockup.moi.dto.OwnershipParcelDto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GetPropertyTitleDeedResponse {
    private List<OwnershipParcelDto> ownershipParcels;
    private List<OwnershipFlatDto> ownershipFlats;
    private List<BeneficiaryParcelDto> beneficiaryParcels;
    private List<BeneficiaryFlatDto> beneficiaryFlats;
}
