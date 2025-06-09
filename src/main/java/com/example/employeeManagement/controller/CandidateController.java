package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.CandidateDto;
import com.example.employeeManagement.entity.Candidate;
import com.example.employeeManagement.service.CandidateService;
import com.example.employeeManagement.serviceImpl.CandidateServiceImpl;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {

    private CandidateService candidateService;

    private EntityDtoConverter entityDtoConverter;

    private ObjectConverter objectConverter;

    @Autowired
    public CandidateController(CandidateService candidateService, EntityDtoConverter entityDtoConverter, ObjectConverter objectConverter) {
        this.candidateService = candidateService;
        this.entityDtoConverter = entityDtoConverter;
        this.objectConverter = objectConverter;
    }


    @PostMapping("/saveCandidate")
    public ResponseEntity<Candidate> saveCandidate(@RequestBody @Valid String payload) {
        CandidateDto candidateDto = objectConverter.convertToObject(payload, CandidateDto.class);
        Candidate candidate = entityDtoConverter.convert(candidateDto, Candidate.class);
        return new ResponseEntity<>(candidateService.saveCandidate(candidate), HttpStatus.CREATED);
    }

    @GetMapping("/getAllCandidates")
    public List<Candidate> getAllCandidates() {
        List<Candidate> candidateList = candidateService.getAllCandidates();
        return candidateList;
    }

    @GetMapping("/getCandidateById")
    public ResponseEntity<Candidate> getCandidateById(@RequestParam Long id) {
        return new ResponseEntity<>(candidateService.getCandidateById(id), HttpStatus.OK);
    }
}
