package com.codekul.Java10FebSpring.patient.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class PrefixGenderMapping implements Serializable {

    @EmbeddedId
    private PrefixGenderMappingId prefixGenderMappingId;


}
