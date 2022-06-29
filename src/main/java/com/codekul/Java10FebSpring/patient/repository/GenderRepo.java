package com.codekul.Java10FebSpring.patient.repository;

import com.codekul.Java10FebSpring.patient.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender,Integer> {
}
