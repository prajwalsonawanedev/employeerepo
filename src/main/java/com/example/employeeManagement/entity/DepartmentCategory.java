package com.example.employeeManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DepartmentCategoryTbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_category_id")
    private Integer deptCategoryId;

    @Column(name = "department_category_name")
    private String deptCategoryName;

    @Column(name = "department_category_description")
    private String deptdescription;

    @Column(name = "department_category_location")
    private String location;

    @Column(name = "department_category_manager")
    private String manager;

    @Column(name = "department_category_size")
    private Integer size;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    @JsonManagedReference
    private Department department;

    @OneToMany(mappedBy = "departmentCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employeeList = new ArrayList<>();

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
