package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.DepartmentDto;
import com.example.employeeManagement.entity.Department;

import java.util.List;

public interface DepartmentService {

    DepartmentDto saveDepartment(Department department);

    DepartmentDto getDepartmentById(Integer deptId);

    List<DepartmentDto> getAllDepartment();
}
