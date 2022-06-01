package com.codekul.Java10FebSpring.manytomany.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "teacher_sub",joinColumns = {@JoinColumn(name = "teacher_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "sub_id",referencedColumnName = "id")})
    private List<Subjects> subjects;

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

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }
}
