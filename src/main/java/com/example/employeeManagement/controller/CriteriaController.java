package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.CriteriaDto;
import com.example.employeeManagement.service.CriteriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CriteriaController {

    private final CriteriaService criteriaService;

    public CriteriaController(CriteriaService criteriaService) {
        this.criteriaService = criteriaService;
    }

    @PostMapping("/createCriteria")
    public ResponseEntity<CriteriaDto> saveCriteria(@RequestBody CriteriaDto criteriaDto, @RequestParam Integer postId) {
        return new ResponseEntity<>(criteriaService.createCriteria(criteriaDto,postId), HttpStatus.CREATED);
    }

    @GetMapping("/getCriteriaById")
    public ResponseEntity<CriteriaDto> getCriteriaById(@RequestParam Integer id) {
        return new ResponseEntity<>(criteriaService.getCriteriaById(id), HttpStatus.OK);
    }

    @GetMapping("/getAllCriteria")
    public ResponseEntity<List<CriteriaDto>> getAllCriteria() {
        return new ResponseEntity<>(criteriaService.getAllCriteria(), HttpStatus.OK);
    }
}
