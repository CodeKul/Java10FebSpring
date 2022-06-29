package com.codekul.Java10FebSpring.patient.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Prefix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String prefix;

    @Transient
    private Integer gender;
}
