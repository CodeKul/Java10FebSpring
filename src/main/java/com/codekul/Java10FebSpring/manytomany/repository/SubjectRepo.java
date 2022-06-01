package com.codekul.Java10FebSpring.manytomany.repository;

import com.codekul.Java10FebSpring.manytomany.domain.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subjects,Integer> {
}
