package com.example.employeeManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "company_tbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "company_name", nullable = false)
    private String name;

    @Column(name = "company_description", nullable = false)
    private String description;

    @Column(name = "company_size")
    private Integer size;

    @Column(name = "company_email")
    private String email;

    @Column(name = "company_address")
    private String address;

    @Column(name = "company_contact_number")
    private String contactNumber;

    @Column(name = "company_type")
    private String companyType;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Department> departmentList = new ArrayList<>();

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employeeList = new ArrayList<>();
}
