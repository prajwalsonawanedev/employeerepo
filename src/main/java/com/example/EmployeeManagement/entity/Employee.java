package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "EmployeeTbl")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer employeeId;

    @Column(name = "employeename")
    public String employeeName;

    @Column(name = "employeeage")
    public Integer employeeAge;

    @Column(name = "employeegender")
    public String employeeGender;

    @Column(name = "employeemaritalstatus")
    public String employeeMaritalStatus;

    @Column(name = "employeecity")
    public String employeeCity;

    @Column(name = "employeestate")
    public String employeeState;

    @Column(name = "employeebloodgroup")
    public String employeeBloodGroup;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "departmentid")
    private Department department;

}
