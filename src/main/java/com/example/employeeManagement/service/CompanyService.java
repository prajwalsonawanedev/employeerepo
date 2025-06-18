package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.CompanyDto;
import com.example.employeeManagement.entity.Company;

import java.util.List;

public interface CompanyService {

    CompanyDto saveCompany(Company company);

    Company updateCompany(Company company);

    CompanyDto getCompanyDetails(Integer id);

    List<CompanyDto> getAllCompanies();


}
