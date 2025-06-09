package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.CompanyDto;
import com.example.employeeManagement.entity.Company;

import java.util.List;

public interface CompanyService {

    Company saveCompany(Company company);

    Company updateCompany(Company company);

    Company getCompanyDetails(Integer id);

    List<Company> getAllCompanies();


}
