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

    private final DepartmentService departmentService;

    private final EntityDtoConverter entityDtoConverter;

    private final ObjectConverter objectConverter;

    public DepartmentController(DepartmentService departmentService, EntityDtoConverter entityDtoConverter, ObjectConverter objectConverter) {
        this.departmentService = departmentService;
        this.entityDtoConverter = entityDtoConverter;
        this.objectConverter = objectConverter;
    }

    @PostMapping("/addDepartment")
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        Department department = entityDtoConverter.convert(departmentDto, Department.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.saveDepartment(department));
    }

    @GetMapping("/getDepartmentDetails")
    public ResponseEntity<DepartmentDto> getDepartmentDetailsById(@RequestParam Integer deptId) {
        return new ResponseEntity<>(departmentService.getDepartmentById(deptId), HttpStatus.OK);
    }

    @GetMapping("/getAllDepartment")
    public ResponseEntity<List<DepartmentDto>> getAllDepartment() {
        return new ResponseEntity<>(departmentService.getAllDepartment(), HttpStatus.OK);
    }
}
