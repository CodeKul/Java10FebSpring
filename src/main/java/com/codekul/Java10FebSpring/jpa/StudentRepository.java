package com.codekul.Java10FebSpring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);
    Student findByNameAndAddress(String name,String address);

}
