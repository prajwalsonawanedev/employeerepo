package com.example.employeeManagement.service;

import com.example.employeeManagement.dto.PositionDto;
import com.example.employeeManagement.entity.Position;

import java.util.List;

public interface PositionService {

    PositionDto createPosition(PositionDto positionDto);

    PositionDto getPosition(Integer id);

    List<PositionDto> getAllPositions();
}
