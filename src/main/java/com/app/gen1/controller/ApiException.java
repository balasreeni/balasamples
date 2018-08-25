package com.app.gen1.controller;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-25T09:43:14.905+05:30")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
