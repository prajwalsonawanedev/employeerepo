package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.CandidateDto;
import com.example.employeeManagement.entity.Candidate;

import java.util.List;

public interface CandidateService {

    CandidateDto saveCandidate(CandidateDto candidate, Integer positionId);

    List<CandidateDto> getAllCandidates();

    CandidateDto getCandidateById(Long id);
}
