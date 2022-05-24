package com.codekul.Java10FebSpring.onetoone.repository;

import com.codekul.Java10FebSpring.onetoone.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee,Integer> {
}
