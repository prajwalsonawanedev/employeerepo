package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentid")
    public Integer departmentId;

    @Column(name ="departmentname" )
    public String departmentName;

    @Column(name ="departmentdescription" )
    public String departmentDescription;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employeesList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "companyId")
    private Company company;
}

