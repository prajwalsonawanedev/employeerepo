package com.example.EmployeeManagement.serviceImpl;

import com.example.EmployeeManagement.entity.Company;
import com.example.EmployeeManagement.repository.CompanyRepository;
import com.example.EmployeeManagement.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    public CompanyRepository companyRepository;

    @Override
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Company company) {
        return null;
    }

    @Override
    public Company getCompanyDetails(Integer id) {
        Optional<Company> company = companyRepository.findById(id);
        return company.get();
    }
}
