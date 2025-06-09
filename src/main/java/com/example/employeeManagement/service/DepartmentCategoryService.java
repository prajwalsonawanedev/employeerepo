package com.example.employeeManagement.service;

import com.example.employeeManagement.entity.DepartmentCategory;

import java.util.List;
import java.util.Optional;

public interface DepartmentCategoryService {

    DepartmentCategory addDepartmentCategory(DepartmentCategory departmentCategory);

    DepartmentCategory getDepartmenCategoryById(Integer id);

    List<DepartmentCategory> getAllDepartmentCategories();
}
