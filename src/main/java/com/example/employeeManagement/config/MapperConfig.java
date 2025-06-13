package com.example.employeeManagement.config;

import com.example.employeeManagement.dto.*;
import com.example.employeeManagement.entity.Company;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);


        //modelMapper.createTypeMap(DepartmentDto.class, Department.class);
       // modelMapper.createTypeMap(EmployeeDto.class, Employee.class);
        //modelMapper.createTypeMap(CompanyDto.class, Company.class);

        return modelMapper;
    }
}
