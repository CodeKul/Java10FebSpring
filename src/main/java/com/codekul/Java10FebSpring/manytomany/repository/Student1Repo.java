package com.codekul.Java10FebSpring.manytomany.repository;

import com.codekul.Java10FebSpring.manytomany.domain.Student1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student1Repo extends JpaRepository<Student1,Integer> {
}
