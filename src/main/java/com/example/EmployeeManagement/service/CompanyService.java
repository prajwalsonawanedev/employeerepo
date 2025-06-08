package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.entity.Company;

public interface CompanyService {

    Company addCompany(Company company);

    Company updateCompany(Company company);

    Company getCompanyDetails(Integer id);


}
