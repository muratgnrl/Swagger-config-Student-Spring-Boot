package com.example.swagger.response;

import java.io.Serializable;

public class Meta extends BaseResponse implements Serializable {
    private int errorCode;
    private String errorDescription;

    public Meta() {
    }

    public Meta(int errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }
}
