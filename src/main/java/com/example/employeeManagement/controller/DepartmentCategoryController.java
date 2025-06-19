package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.DepartmentCategoryDto;
import com.example.employeeManagement.dto.DepartmentDto;
import com.example.employeeManagement.entity.Department;
import com.example.employeeManagement.entity.DepartmentCategory;
import com.example.employeeManagement.service.DepartmentCategoryService;
import com.example.employeeManagement.service.DepartmentService;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentCategoryController {

    private final DepartmentCategoryService departmentCategoryService;

    private final DepartmentService departmentService;

    private final EntityDtoConverter entityDtoConverter;

    private final ObjectConverter objectConverter;

    public DepartmentCategoryController(DepartmentCategoryService departmentCategoryService, EntityDtoConverter entityDtoConverter, DepartmentService departmentService, ObjectConverter objectConverter) {
        this.departmentCategoryService = departmentCategoryService;
        this.entityDtoConverter = entityDtoConverter;
        this.departmentService = departmentService;
        this.objectConverter = objectConverter;
    }

    @PostMapping("/addDepartmentCategory")
    public ResponseEntity<DepartmentCategoryDto> addDepartmentCategoryController(@RequestBody @Valid DepartmentCategoryDto departmentCategoryDto, @RequestParam Integer deptId) {
        DepartmentCategory departmentCategory = entityDtoConverter.convert(departmentCategoryDto, DepartmentCategory.class);
        return new ResponseEntity<>(departmentCategoryService.addDepartmentCategory(departmentCategory, deptId), HttpStatus.CREATED);
    }

    @GetMapping("/getDepartmentCategoryById")
    public ResponseEntity<DepartmentCategoryDto> getDepartmentCategoryById(@RequestParam Integer id) {
        DepartmentCategoryDto departmentCategoryDto = departmentCategoryService.getDepartmenCategoryById(id);
        return new ResponseEntity<>(departmentCategoryDto, HttpStatus.OK);
    }

    @GetMapping("/getAllDepartmentCategory")
    public ResponseEntity<List<DepartmentCategoryDto>> getAllDepartmentCategory() {
        return new ResponseEntity<>(departmentCategoryService.getAllDepartmentCategories(), HttpStatus.OK);
    }


}
