package com.codekul.Java10FebSpring.manytomany.repository;

import com.codekul.Java10FebSpring.manytomany.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
