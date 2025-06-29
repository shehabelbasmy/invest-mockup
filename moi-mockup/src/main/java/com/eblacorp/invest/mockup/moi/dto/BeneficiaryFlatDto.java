package com.eblacorp.invest.mockup.moi.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BeneficiaryFlatDto{
    private String pin;
    private String cityName;
    private String zoneName;
    private String district;
    private Long parentParcelNumber;
    private Long flatNumber;
    private Float share;
}
