package com.example.employeeManagement.service;

import com.example.employeeManagement.entity.Candidate;

import java.util.List;

public interface CandidateService {

    Candidate saveCandidate(Candidate candidate);

    List<Candidate> getAllCandidates();

    Candidate getCandidateById(Long id);
}
