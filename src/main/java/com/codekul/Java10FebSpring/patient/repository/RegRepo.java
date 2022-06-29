package com.codekul.Java10FebSpring.patient.repository;

import com.codekul.Java10FebSpring.patient.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegRepo extends JpaRepository<Registration,Integer> {
}
