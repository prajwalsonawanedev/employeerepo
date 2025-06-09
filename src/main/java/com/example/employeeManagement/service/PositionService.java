package com.example.employeeManagement.service;

import com.example.employeeManagement.entity.Position;

public interface PositionService {

    Position createPosition(Position position);

    Position getPosition(Integer id);
}
