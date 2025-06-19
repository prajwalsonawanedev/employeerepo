package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.dto.CriteriaDto;
import com.example.employeeManagement.entity.Criteria;
import com.example.employeeManagement.entity.Position;
import com.example.employeeManagement.exception.ResourceNotFoundException;
import com.example.employeeManagement.repository.CriteriaRepository;
import com.example.employeeManagement.repository.PositionRepository;
import com.example.employeeManagement.service.CriteriaService;
import com.example.employeeManagement.util.EntityDtoConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CriteriaServiceImpl implements CriteriaService {

    private final CriteriaRepository criteriaRepository;

    private final EntityDtoConverter entityDtoConverter;

    private final PositionRepository positionRepository;

    public CriteriaServiceImpl(CriteriaRepository criteriaRepository, EntityDtoConverter entityDtoConverter, PositionRepository positionRepository) {
        this.criteriaRepository = criteriaRepository;
        this.entityDtoConverter = entityDtoConverter;
        this.positionRepository = positionRepository;
    }


    @Override
    public CriteriaDto createCriteria(CriteriaDto criteriaDto, Integer postId) {
        Criteria criteria = entityDtoConverter.convert(criteriaDto, Criteria.class);
        Position position = positionRepository.findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Position Not Found :" + postId));
        criteria.setPosition(position);
        return entityDtoConverter.convert(criteriaRepository.save(criteria), CriteriaDto.class);

    }

    @Override
    public CriteriaDto getCriteriaById(Integer id) {
        return criteriaRepository.findById(id)
                .map(criteria -> entityDtoConverter.convert(criteria, CriteriaDto.class))
                .orElseThrow(() -> new ResourceNotFoundException("Criteria Not Found with Id :" + id));

    }

    @Override
    public List<CriteriaDto> getAllCriteria() {
        return criteriaRepository.findAll().stream()
                .map(criteria -> entityDtoConverter.convert(criteria, CriteriaDto.class))
                .toList();
    }
}
