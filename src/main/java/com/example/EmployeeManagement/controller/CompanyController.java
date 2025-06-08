package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.entity.Company;
import com.example.EmployeeManagement.serviceImpl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {

    @Autowired
    public CompanyServiceImpl companyService;

    @PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }

    @GetMapping("/getCompanyDetails/{id}")
    public Company getCompanyDetails(@PathVariable Integer id) {
        return companyService.getCompanyDetails(id);
    }
}
