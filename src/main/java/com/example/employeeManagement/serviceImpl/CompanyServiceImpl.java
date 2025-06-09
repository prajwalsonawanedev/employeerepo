package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.dto.CompanyDto;
import com.example.employeeManagement.entity.Company;
import com.example.employeeManagement.repository.CompanyRepository;
import com.example.employeeManagement.service.CompanyService;
import com.example.employeeManagement.util.EntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    public CompanyRepository companyRepository;

    @Autowired
    private EntityDtoConverter entityDtoConverter;

    public CompanyServiceImpl(CompanyRepository companyRepository, EntityDtoConverter entityDtoConverter) {
        this.entityDtoConverter = entityDtoConverter;
        this.companyRepository = companyRepository;
    }

    @Override
    public Company saveCompany(Company company) {
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

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
