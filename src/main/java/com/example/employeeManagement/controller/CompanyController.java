package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.CompanyDto;
import com.example.employeeManagement.entity.Company;
import com.example.employeeManagement.service.CompanyService;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    private ObjectConverter objectConverter;

    private EntityDtoConverter entityDtoConverter;

    @Autowired
    public CompanyController(CompanyService companyService, ObjectConverter objectConverter, EntityDtoConverter entityDtoConverter) {
        this.companyService = companyService;
        this.objectConverter = objectConverter;
        this.entityDtoConverter = entityDtoConverter;
    }


    @PostMapping("/addCompany")
    public ResponseEntity<Company> addCompany(@RequestBody @Valid String payload) {
        CompanyDto companyDto = objectConverter.convertToObject(payload, CompanyDto.class);
        Company company = entityDtoConverter.convert(companyDto, Company.class);
        return new ResponseEntity<>(companyService.saveCompany(company), HttpStatus.CREATED);
    }

    @GetMapping("/getCompanyDetails/{id}")
    public ResponseEntity<Company> getCompanyDetails(@PathVariable Integer id) {
        return new ResponseEntity<>(companyService.getCompanyDetails(id), HttpStatus.OK);
    }

    @GetMapping("/getAllCompanies")
    public ResponseEntity<List<Company>> getAllCompanies() {
        return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
    }
}
