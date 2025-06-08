package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DepartmentCategoryTbl")
public class DepartmentCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentcategoryid")
    public Integer deptCategoryId;

    @Column(name = "departmentcategoryname")
    public String deptCategoryName;


}
