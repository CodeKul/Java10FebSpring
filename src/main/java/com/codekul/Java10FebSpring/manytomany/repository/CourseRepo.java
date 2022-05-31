package com.codekul.Java10FebSpring.manytomany.repository;

import com.codekul.Java10FebSpring.manytomany.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
