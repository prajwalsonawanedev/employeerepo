package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CompanyTbl")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyid")
    public Integer companyId;

    @Column(name = "companyname")
    public String companyName;

    @Column(name = "companydescription")
    public String companyDescription;

    @Column(name = "companySize")
    public Integer companySize;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Department> departmentList = new ArrayList<>();



}
