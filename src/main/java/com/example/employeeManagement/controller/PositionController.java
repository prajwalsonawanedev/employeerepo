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

import java.util.List;

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
    public ResponseEntity<PositionDto> addPosition(@RequestBody PositionDto positionDto) {
        return new ResponseEntity<>(positionService.createPosition(positionDto), HttpStatus.CREATED);
    }

    @GetMapping("/getPositon")
    public ResponseEntity<PositionDto> getPosition(@RequestParam Integer pId) {
        return new ResponseEntity<>(positionService.getPosition(pId), HttpStatus.OK);
    }

    @GetMapping("/getAllPositions")
    public ResponseEntity<List<PositionDto>> getAllPositions() {
        return new ResponseEntity<>(positionService.getAllPositions(), HttpStatus.OK);
    }
}
