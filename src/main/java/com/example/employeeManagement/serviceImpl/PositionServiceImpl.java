package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.dto.PositionDto;
import com.example.employeeManagement.entity.Position;
import com.example.employeeManagement.exception.ResourceNotFoundException;
import com.example.employeeManagement.repository.PositionRepository;
import com.example.employeeManagement.service.PositionService;
import com.example.employeeManagement.util.EntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;

    private final EntityDtoConverter entityDtoConverter;


    public PositionServiceImpl(PositionRepository positionRepository, EntityDtoConverter entityDtoConverter) {
        this.positionRepository = positionRepository;
        this.entityDtoConverter = entityDtoConverter;
    }

    @Override
    public PositionDto createPosition(PositionDto positionDto) {
        Position position = entityDtoConverter.convert(positionDto, Position.class);
        Position result = positionRepository.save(position);
        return entityDtoConverter.convert(result, PositionDto.class);
    }

    @Override
    public PositionDto getPosition(Integer id) {
        Optional<Position> positionOptional = positionRepository.findById(id);

        return positionOptional.map(position -> entityDtoConverter.convert(position, PositionDto.class)).orElseThrow(() -> new ResourceNotFoundException("Position Not Found position Id :" + id));
    }

    @Override
    public List<PositionDto> getAllPositions() {
        return positionRepository.findAll()
                .stream()
                .map(position -> entityDtoConverter.convert(position, PositionDto.class)).toList();
    }

}
