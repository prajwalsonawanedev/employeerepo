package com.example.employeeManagement.controller;

import com.example.employeeManagement.dto.PositionDto;
import com.example.employeeManagement.entity.Position;
import com.example.employeeManagement.service.PositionService;
import com.example.employeeManagement.util.EntityDtoConverter;
import com.example.employeeManagement.util.ObjectConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PositionController {

    private PositionService positionService;

    private EntityDtoConverter entityDtoConverter;

    private ObjectConverter objectConverter;

    @Autowired
    public PositionController(PositionService positionService, EntityDtoConverter entityDtoConverter, ObjectConverter objectConverter) {
        this.positionService = positionService;
        this.entityDtoConverter = entityDtoConverter;
        this.objectConverter = objectConverter;
    }

    @PostMapping("/addPosition")
    public ResponseEntity<Position> addPosition(@RequestBody String payload) {
        PositionDto positionDto = objectConverter.convertToObject(payload, PositionDto.class);
        Position position = entityDtoConverter.convert(positionDto, Position.class);
        return new ResponseEntity<>(positionService.createPosition(position), HttpStatus.CREATED);
    }

    @GetMapping("/getPositon")
    public ResponseEntity<Position> getPosition(@RequestParam Integer pId) {
        return new ResponseEntity<>(positionService.getPosition(pId), HttpStatus.OK);
    }
}
