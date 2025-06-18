package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.DepartmentCategoryDto;
import com.example.employeeManagement.entity.DepartmentCategory;

import java.util.List;
import java.util.Optional;

public interface DepartmentCategoryService {

    DepartmentCategoryDto addDepartmentCategory(DepartmentCategory departmentCategory,Integer deptId);

    DepartmentCategoryDto getDepartmenCategoryById(Integer id);

    List<DepartmentCategoryDto> getAllDepartmentCategories();
}
