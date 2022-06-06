package com.codekul.Java10FebSpring.manytomany.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.JoinColumn;

@JsonPropertyOrder({"id", "name","address"})
public interface TeacherResponse {

    @JsonProperty("Id")
    Integer getId();

    String getName();

    String getAddress();
}
