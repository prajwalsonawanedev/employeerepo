package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.dto.CompanyDto;
import com.example.employeeManagement.entity.Company;
import com.example.employeeManagement.exception.ResourceNotFoundException;
import com.example.employeeManagement.repository.CompanyRepository;
import com.example.employeeManagement.service.CompanyService;
import com.example.employeeManagement.util.EntityDtoConverter;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    public final CompanyRepository companyRepository;

    private final EntityDtoConverter entityDtoConverter;

    public CompanyServiceImpl(CompanyRepository companyRepository, EntityDtoConverter entityDtoConverter) {
        this.entityDtoConverter = entityDtoConverter;
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyDto saveCompany(Company company) {
        return entityDtoConverter.convert(companyRepository.save(company), CompanyDto.class);
    }

    @Override
    public Company updateCompany(Company company) {
        return null;
    }

    @Override
    public CompanyDto getCompanyDetails(Integer id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        return companyOptional
                .map(company -> entityDtoConverter.convert(company, CompanyDto.class))
                .orElseThrow(() -> new ResourceNotFoundException("Company Details not found with Id :" + id));
    }

    @Override
    public List<CompanyDto> getAllCompanies() {
        return companyRepository.findAll()
                .stream()
                .map(company -> entityDtoConverter.convert(company, CompanyDto.class))
                .toList();
    }
}
