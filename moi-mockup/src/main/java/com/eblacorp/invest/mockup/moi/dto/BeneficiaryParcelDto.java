package com.eblacorp.invest.mockup.moi.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BeneficiaryParcelDto {
    private String pin;
    private String cityName;
    private String zoneName;
    private String district;
    private String parcelTypeArabicName;
    private Long parcelNumber;
    private Double share;
}
