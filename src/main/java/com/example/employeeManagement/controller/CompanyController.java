package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.CompanyDto;
import com.example.employeeManagement.entity.Company;
import com.example.employeeManagement.service.CompanyService;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import jakarta.validation.Valid;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    private final ObjectConverter objectConverter;

    private final EntityDtoConverter entityDtoConverter;

    public CompanyController(CompanyService companyService, ObjectConverter objectConverter, EntityDtoConverter entityDtoConverter) {
        this.companyService = companyService;
        this.objectConverter = objectConverter;
        this.entityDtoConverter = entityDtoConverter;
    }


    @PostMapping("/addCompany")
    public ResponseEntity<CompanyDto> addCompany(@RequestBody @Valid CompanyDto companyDto) {
        Company company = entityDtoConverter.convert(companyDto, Company.class);
        return new ResponseEntity<>(companyService.saveCompany(company), HttpStatus.CREATED);
    }

    @GetMapping("/getCompanyDetails")
    public ResponseEntity<CompanyDto> getCompanyDetails(@RequestParam Integer id) {
        return new ResponseEntity<>(companyService.getCompanyDetails(id), HttpStatus.OK);
    }

    @GetMapping("/getAllCompanies")
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
    }
}
