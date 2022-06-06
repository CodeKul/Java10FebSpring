package com.codekul.Java10FebSpring.manytomany.repository;

import com.codekul.Java10FebSpring.manytomany.domain.Teacher;
import com.codekul.Java10FebSpring.manytomany.dto.TeacherResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

    @Query(value = "call getTeacherData()",nativeQuery = true)
    List<TeacherResponse> getTeacherData();

}
