package com.example.employeeManagement.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectConverter {


    private final ObjectMapper objectMapper;

    @Autowired
    public ObjectConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> T convertToObject(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert Json to Java object");
        }
    }
}
