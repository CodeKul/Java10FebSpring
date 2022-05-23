package com.codekul.Java10FebSpring.onetoone.repository;

import com.codekul.Java10FebSpring.onetoone.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
