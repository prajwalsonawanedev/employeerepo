package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.dto.CompanyDto;
import com.example.employeeManagement.dto.DepartmentDto;
import com.example.employeeManagement.entity.Company;
import com.example.employeeManagement.entity.Department;
import com.example.employeeManagement.exception.ResourceNotFoundException;
import com.example.employeeManagement.repository.DepartmentRepository;
import com.example.employeeManagement.service.CompanyService;
import com.example.employeeManagement.service.DepartmentService;
import com.example.employeeManagement.util.EntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    private CompanyService companyService;

    private EntityDtoConverter entityDtoConverter;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, CompanyService companyService, EntityDtoConverter entityDtoConverter) {
        this.entityDtoConverter = entityDtoConverter;
        this.departmentRepository = departmentRepository;
        this.companyService = companyService;
    }

    @Override
    public DepartmentDto saveDepartment(Department department) {

        CompanyDto companyDto = companyService.getCompanyDetails(department.getCompany().getCompanyId());
        Company company = entityDtoConverter.convert(companyDto, Company.class);
        department.setCompany(company);
        Department result = departmentRepository.save(department);
        return entityDtoConverter.convert(result, DepartmentDto.class);
    }

    @Override
    public DepartmentDto getDepartmentById(Integer deptId) {
        Optional<Department> departmentOptional = departmentRepository.findById(deptId);
        return departmentOptional
                .map(department -> entityDtoConverter.convert(department, DepartmentDto.class))
                .orElseThrow(() -> new ResourceNotFoundException("Department Details not Found with Id :" + deptId));

    }

    @Override
    public List<DepartmentDto> getAllDepartment() {
        List<Department> departmentList = departmentRepository.findAll();
        return departmentList
                .stream()
                .map(department -> entityDtoConverter.convert(department, DepartmentDto.class))
                .toList();
    }


}
