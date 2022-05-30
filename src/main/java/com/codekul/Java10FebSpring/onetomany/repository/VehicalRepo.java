package com.codekul.Java10FebSpring.onetomany.repository;

import com.codekul.Java10FebSpring.onetomany.domain.Vehical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicalRepo extends JpaRepository<Vehical,Integer> {
}
