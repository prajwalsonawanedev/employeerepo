package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.entity.Candidate;
import com.example.employeeManagement.repository.CandidateRepository;
import com.example.employeeManagement.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate saveCandidate(Candidate candidate) {
        Candidate result = candidateRepository.save(candidate);
        return result;
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    @Override
    public Candidate getCandidateById(Long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);
        return candidate.get();
    }
}
