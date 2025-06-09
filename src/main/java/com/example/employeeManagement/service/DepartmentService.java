package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.DepartmentDto;
import com.example.employeeManagement.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Integer deptId);

    List<Department> getAllDepartment();
}
