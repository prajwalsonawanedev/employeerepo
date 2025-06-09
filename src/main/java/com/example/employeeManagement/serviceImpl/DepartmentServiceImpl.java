package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.entity.Company;
import com.example.employeeManagement.entity.Department;
import com.example.employeeManagement.repository.DepartmentRepository;
import com.example.employeeManagement.service.CompanyService;
import com.example.employeeManagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private CompanyService companyService;

    @Override
    public Department saveDepartment(Department department) {

        Company company = companyService.getCompanyDetails(department.getCompany().getCompanyId());
        department.setCompany(company);
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Integer deptId) {
        Optional<Department> department = departmentRepository.findById(deptId);
        return department.get();
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }


}
