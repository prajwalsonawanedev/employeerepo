package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.DepartmentCategoryDto;
import com.example.employeeManagement.entity.Department;
import com.example.employeeManagement.entity.DepartmentCategory;
import com.example.employeeManagement.service.DepartmentCategoryService;
import com.example.employeeManagement.service.DepartmentService;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentCategoryController {

    private DepartmentCategoryService departmentCategoryService;

    private DepartmentService departmentService;

    private EntityDtoConverter entityDtoConverter;

    private ObjectConverter objectConverter;

    @Autowired
    public DepartmentCategoryController(DepartmentCategoryService departmentCategoryService, EntityDtoConverter entityDtoConverter, DepartmentService departmentService, ObjectConverter objectConverter) {
        this.departmentCategoryService = departmentCategoryService;
        this.entityDtoConverter = entityDtoConverter;
        this.departmentService = departmentService;
        this.objectConverter = objectConverter;
    }

    @PostMapping("/addDepartmentCategory")
    public ResponseEntity<DepartmentCategory> addDepartmentCategoryController(@RequestBody String payload, @RequestParam Integer deptId) {
        DepartmentCategoryDto departmentCategoryDto = objectConverter.convertToObject(payload, DepartmentCategoryDto.class);
        DepartmentCategory departmentCategory = entityDtoConverter.convert(departmentCategoryDto, DepartmentCategory.class);
        Department department = departmentService.getDepartmentById(deptId);
        departmentCategory.setDepartment(department);
//        departmentCategoryService.addDepartmentCategory(departmentCategory);
        return new ResponseEntity<>(departmentCategoryService.addDepartmentCategory(departmentCategory), HttpStatus.CREATED);
    }

    @GetMapping("/getDepartmentCategoryById/{id}")
    public ResponseEntity<DepartmentCategory> getDepartmentCategoryById(@PathVariable Integer id) {
        DepartmentCategory departmentCategory = departmentCategoryService.getDepartmenCategoryById(id);
        return new ResponseEntity<>(departmentCategory, HttpStatus.OK);
    }

    public ResponseEntity<List<DepartmentCategory>> getAllDepartmentCategory() {
        return new ResponseEntity<>(departmentCategoryService.getAllDepartmentCategories(), HttpStatus.OK);
    }


}
