package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.CandidateDto;
import com.example.employeeManagement.entity.Candidate;
import com.example.employeeManagement.service.CandidateService;
import com.example.employeeManagement.serviceImpl.CandidateServiceImpl;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import jakarta.validation.Valid;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {

    private final CandidateService candidateService;

    private final EntityDtoConverter entityDtoConverter;

    private final ObjectConverter objectConverter;

    public CandidateController(CandidateService candidateService, EntityDtoConverter entityDtoConverter, ObjectConverter objectConverter) {
        this.candidateService = candidateService;
        this.entityDtoConverter = entityDtoConverter;
        this.objectConverter = objectConverter;
    }


    @PostMapping("/saveCandidate")
    public ResponseEntity<CandidateDto> saveCandidate(@RequestBody @Valid CandidateDto candidateDto, @RequestParam Integer positionId) {
        return new ResponseEntity<>(candidateService.saveCandidate(candidateDto, positionId), HttpStatus.CREATED);
    }

    @GetMapping("/getAllCandidates")
    public ResponseEntity<List<CandidateDto>> getAllCandidates() {
        return new ResponseEntity<>(candidateService.getAllCandidates(), HttpStatus.OK);
    }

    @GetMapping("/getCandidateById")
    public ResponseEntity<CandidateDto> getCandidateById(@RequestParam Long id) {
        return new ResponseEntity<>(candidateService.getCandidateById(id), HttpStatus.OK);
    }
}
