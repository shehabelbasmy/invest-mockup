package com.eblacorp.mockup.moi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnershipFlatDto {
    private String pin;
    private String cityName;
    private String zoneName;
    private String district;
    private Long parentParcelNumber;
    private Long flatNumber;
    private Double share;
}
