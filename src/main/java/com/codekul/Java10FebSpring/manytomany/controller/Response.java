package com.codekul.Java10FebSpring.manytomany.controller;

import com.codekul.Java10FebSpring.manytomany.domain.Teacher;

public class Response {
    private String message;

    private Teacher result;

    private Integer statusCode;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Teacher getResult() {
        return result;
    }

    public void setResult(Teacher result) {
        this.result = result;
    }
}
