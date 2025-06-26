package com.eblacorp.mockup.moi.rest.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestResponse<T>{


    public enum StatusEnum {
        OK("OK"), ERROR("ERROR");
        private final String statusTxt;

        private StatusEnum(String statusTxt) {
            this.statusTxt = statusTxt;
        }

        @Override
        public String toString() {
            return statusTxt;
        }
    }

    private StatusEnum status;
    private String errorCode;
    private String errorDescription;
    private String fixSuggestion;

    private T body;

    public RestResponse() {
        this.status = StatusEnum.OK;
    }

    public RestResponse(T body) {
        super();
        this.status = StatusEnum.OK;
        this.body = body;
    }

    public RestResponse(String errorCode, String errorDescription, String fixSuggestion) {
        super();
        this.status = StatusEnum.ERROR;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.fixSuggestion = fixSuggestion;
    }

    public RestResponse(String errorCode, String errorDescription) {
        super();
        this.status = StatusEnum.ERROR;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }


    @Override
    public String toString() {
        return "\n status: " + status
                + "\n  errorCode: " + errorCode
                + "\n  errorDescription: " + errorDescription
                + "\n  fixSuggestion: " + fixSuggestion;
    }

}
