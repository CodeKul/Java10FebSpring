package com.codekul.Java10FebSpring.manytomany.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
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

    }
