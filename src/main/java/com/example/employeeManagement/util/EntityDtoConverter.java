package com.example.employeeManagement.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public EntityDtoConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public <S, T> T convert(S source, Class<T> targetClass) {
        return modelMapper.map(source, targetClass);
    }
}
