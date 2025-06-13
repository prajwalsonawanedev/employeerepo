package com.example.employeeManagement.serviceImpl;

import com.example.employeeManagement.entity.Position;
import com.example.employeeManagement.repository.PositionRepository;
import com.example.employeeManagement.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {

    private PositionRepository positionRepository;

    @Autowired
    public PositionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public Position createPosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public Position getPosition(Integer id) {
        Optional<Position> position = positionRepository.findById(id);
        return position.get();
    }

}
