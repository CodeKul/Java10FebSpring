package com.codekul.Java10FebSpring.manytomany.controller;

import com.codekul.Java10FebSpring.manytomany.domain.Teacher;
import lombok.Setter;

@Setter
public class Response<T> {
    private String message;

    private T result;

    private Integer statusCode;

}
