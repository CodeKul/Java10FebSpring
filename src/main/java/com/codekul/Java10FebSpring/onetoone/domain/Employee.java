package com.codekul.Java10FebSpring.onetoone.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference
    private SalaryAccount salaryAccount;

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

    public SalaryAccount getSalaryAccount() {
        return salaryAccount;
    }

    public void setSalaryAccount(SalaryAccount salaryAccount) {
        this.salaryAccount = salaryAccount;
    }
}

/**
 * {
 *     "name": "rahul",
 *     "address": "Pune",
 *     "salaryAccount": {
 *         "accountNumber": 455453,
 *         "ifscCode": "tr566566"
 *     }
 * }
 *
 *
 */