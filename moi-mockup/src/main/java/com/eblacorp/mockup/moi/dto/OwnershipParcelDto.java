package com.eblacorp.mockup.moi.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OwnershipParcelDto{
    private String pin;
    private String cityName;
    private String zoneName;
    private String district;
    private String parcelTypeArabicName;
    private Long parcelNumber;
    private Double share;
}
