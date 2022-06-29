package com.codekul.Java10FebSpring.patient.repository;

import com.codekul.Java10FebSpring.patient.model.PrefixGenderMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixGenderMappingRepo extends JpaRepository<PrefixGenderMapping, Object> {
}
