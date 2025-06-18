package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.dto.CandidateDto;
import com.example.employeeManagement.entity.Candidate;
import com.example.employeeManagement.entity.Position;
import com.example.employeeManagement.exception.ResourceNotFoundException;
import com.example.employeeManagement.repository.CandidateRepository;
import com.example.employeeManagement.repository.PositionRepository;
import com.example.employeeManagement.service.CandidateService;
import com.example.employeeManagement.util.EntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;

    private final EntityDtoConverter entityDtoConverter;
    private final PositionRepository positionRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository, EntityDtoConverter entityDtoConverter, PositionRepository positionRepository) {
        this.candidateRepository = candidateRepository;
        this.entityDtoConverter = entityDtoConverter;
        this.positionRepository = positionRepository;
    }

    @Override
    public CandidateDto saveCandidate(CandidateDto candidateDto, Integer positionId) {
        Position position = positionRepository.findById(positionId)
                .orElseThrow(() -> new ResourceNotFoundException("Position Not Found positionId :" + positionId));

        Candidate candidate = entityDtoConverter.convert(candidateDto, Candidate.class);
        candidate.setPosition(position);
        Candidate result = candidateRepository.save(candidate);
        return entityDtoConverter.convert(result, CandidateDto.class);
    }

    @Override
    public List<CandidateDto> getAllCandidates() {
        return candidateRepository.findAll().stream()
                .map(Candidate -> entityDtoConverter.convert(Candidate, CandidateDto.class))
                .toList();
    }

    @Override
    public CandidateDto getCandidateById(Long id) {
        Optional<Candidate> candidateOptional = candidateRepository.findById(id);
        return candidateOptional.
                map(candidate -> entityDtoConverter.convert(candidate, CandidateDto.class))
                .orElseThrow(() -> new ResourceNotFoundException("Candidate Details not Found"));
    }
}
