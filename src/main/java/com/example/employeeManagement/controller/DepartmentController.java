package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.DepartmentDto;
import com.example.employeeManagement.entity.Department;
import com.example.employeeManagement.service.DepartmentService;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    private EntityDtoConverter entityDtoConverter;

    private ObjectConverter objectConverter;

    @Autowired
    public DepartmentController(DepartmentService departmentService, EntityDtoConverter entityDtoConverter, ObjectConverter objectConverter) {
        this.departmentService = departmentService;
        this.entityDtoConverter = entityDtoConverter;
        this.objectConverter = objectConverter;
    }

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> saveDepartment(@RequestBody String payload) {
        DepartmentDto departmentDto = objectConverter.convertToObject(payload, DepartmentDto.class);
        Department department = entityDtoConverter.convert(departmentDto, Department.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.saveDepartment(department));
    }

    @GetMapping("/getDepartmentDetails/{deptId}")
    public ResponseEntity<Department> getDepartmentDetailsById(@PathVariable Integer deptId) {
        return new ResponseEntity<>(departmentService.getDepartmentById(deptId), HttpStatus.OK);
    }

    @GetMapping("/getAllDepartment")
    public ResponseEntity<List<Department>> getAllDepartment() {
        return new ResponseEntity<>(departmentService.getAllDepartment(), HttpStatus.OK);
    }
}
