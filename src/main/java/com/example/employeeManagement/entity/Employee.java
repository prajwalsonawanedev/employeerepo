package com.example.employeeManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EmployeeTbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer employeeId;

    @Column(name = "employeename", nullable = false)
    public String employeeName;

    @Column(name = "employeeage", nullable = false)
    public Integer employeeAge;

    @Column(name = "employeegender", nullable = false)
    public String employeeGender;

    @Column(name = "employeemaritalstatus")
    public String employeeMaritalStatus;

    @Column(name = "employeecity", nullable = false)
    public String employeeCity;

    @Column(name = "employeestate", nullable = false)
    public String employeeState;

    @Column(name = "employeebloodgroup")
    public String employeeBloodGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departmentCategory_id")
    private DepartmentCategory departmentCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

}
