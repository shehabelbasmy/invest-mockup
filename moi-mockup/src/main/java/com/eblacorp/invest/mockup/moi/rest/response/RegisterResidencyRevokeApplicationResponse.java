package com.eblacorp.invest.mockup.moi.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResidencyRevokeApplicationResponse implements Serializable {

    private String respCode;
    private String respArabicMsg;
    private String respEngMsg;

}
