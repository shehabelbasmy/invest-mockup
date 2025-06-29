package com.eblacorp.invest.mockup.moi.integration.response;

import java.util.List;

import com.eblacorp.invest.mockup.moi.dto.BeneficiaryFlatDto;
import com.eblacorp.invest.mockup.moi.dto.BeneficiaryParcelDto;
import com.eblacorp.invest.mockup.moi.dto.OwnershipFlatDto;
import com.eblacorp.invest.mockup.moi.dto.OwnershipParcelDto;

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
