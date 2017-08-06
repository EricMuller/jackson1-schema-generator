package com.emu.apps.sample.jackson.restmodel;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by M10941 on 31/07/2017.
 */
public class CalibrationResponse {

    @JsonProperty("code")
    private int code = 0;

    @JsonProperty("message")
    private String message = "";


    public CalibrationResponse() {
    }

    public CalibrationResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
