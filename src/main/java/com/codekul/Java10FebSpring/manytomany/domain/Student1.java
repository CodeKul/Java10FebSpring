package com.codekul.Java10FebSpring.manytomany.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student1")
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "stud_course",joinColumns = {@JoinColumn(name = "s_id",referencedColumnName = "id") },
    inverseJoinColumns = {@JoinColumn(name = "c_id",referencedColumnName = "id")})
    private List<Course> courses;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
