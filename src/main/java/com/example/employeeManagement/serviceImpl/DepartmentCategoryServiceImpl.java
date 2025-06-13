package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.entity.DepartmentCategory;
import com.example.employeeManagement.repository.DepartmentCategoryRepository;
import com.example.employeeManagement.service.DepartmentCategoryService;
import com.example.employeeManagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentCategoryServiceImpl implements DepartmentCategoryService {

    @Autowired
    private DepartmentCategoryRepository departmentCategoryRepository;

    @Autowired
    private DepartmentService departmentService;


    @Override
    public DepartmentCategory addDepartmentCategory(DepartmentCategory departmentCategory) {
//        Department department = departmentService.getDepartmentById(departmentCategory.getDepartment().getDepartmentId());
//        departmentCategory.setDepartment(department);
        return departmentCategoryRepository.save(departmentCategory);
    }

    @Override
    public DepartmentCategory getDepartmenCategoryById(Integer id) {
        Optional<DepartmentCategory> departmentCategory = departmentCategoryRepository.findById(id);
        return departmentCategory.get();
    }

    @Override
    public List<DepartmentCategory> getAllDepartmentCategories() {
        return departmentCategoryRepository.findAll();
    }
}
