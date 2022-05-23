package com.codekul.Java10FebSpring.onetoone.controller;

import com.codekul.Java10FebSpring.onetoone.domain.Aadhar;
import com.codekul.Java10FebSpring.onetoone.domain.Person;
import com.codekul.Java10FebSpring.onetoone.repository.AadharRepository;
import com.codekul.Java10FebSpring.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AadharRepository aadharRepository;


    @PostMapping("savePerson")
    public String savePerson(){
        Person person = new Person();

        person.setName("Prakash");
        person.setAddress("Pune");

        Aadhar aadhar = new Aadhar();
        aadhar.setNumber(2434342343445L);
        aadhar.setPerson(person);

        person.setAadhar(aadhar);

        personRepository.save(person);
        aadharRepository.save(aadhar);

        return "saved person";

    }

}
