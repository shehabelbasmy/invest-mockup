package com.eblacorp.mockup.moi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApplicantTypeEnum {

    RESIDENT(1, "Resident"),
    VISITOR(2, "Visitor");

    private final int id;
    private final String type;

    // Method to get an enum from the id
    public static ApplicantTypeEnum fromId(int id) {
        for (ApplicantTypeEnum applicantType : ApplicantTypeEnum.values()) {
            if (applicantType.id == id) {
                return applicantType;
            }
        }
        throw new IllegalArgumentException("Invalid Applicant Type ID: " + id);
    }

    // Method to get an enum from the type
    public static ApplicantTypeEnum fromType(String type) {
        for (ApplicantTypeEnum applicantType : ApplicantTypeEnum.values()) {
            if (applicantType.type.equalsIgnoreCase(type)) {
                return applicantType;
            }
        }
        throw new IllegalArgumentException("Invalid Applicant Type: " + type);
    }
}
