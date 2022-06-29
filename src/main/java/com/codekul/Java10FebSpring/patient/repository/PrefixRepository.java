package com.codekul.Java10FebSpring.patient.repository;

import com.codekul.Java10FebSpring.patient.model.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixRepository extends JpaRepository<Prefix,Integer> {
}
