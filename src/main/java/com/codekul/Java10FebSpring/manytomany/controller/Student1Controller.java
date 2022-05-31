package com.codekul.Java10FebSpring.manytomany.controller;


import com.codekul.Java10FebSpring.jpa.Student;
import com.codekul.Java10FebSpring.manytomany.domain.Course;
import com.codekul.Java10FebSpring.manytomany.domain.Student1;
import com.codekul.Java10FebSpring.manytomany.repository.CourseRepo;
import com.codekul.Java10FebSpring.manytomany.repository.Student1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student1Controller {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private Student1Repo student1Repo;

    @PostMapping("saveCourse")
    public String saveCourse(@RequestBody Course course) {
        courseRepo.save(course);
        return "course saved...";
    }

    @PostMapping("saveStudent1")
    public String saveStudent1(@RequestBody Student1 student1) {
        student1Repo.save(student1);
        return "student saved...";
    }


}

/**
 * {
 *     "name": "Rahul",
 *     "address": "Pune",
 *     "courses": [
 *         {
 *             "id": 3
 *         },
 *         {
 *             "id": 4
 *         }
 *     ]
 * }
 *
 */