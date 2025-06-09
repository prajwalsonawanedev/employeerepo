package com.example.EmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InterviwerDto {

    public Integer interviwerId;
    public String interviwerDescription;
    public EmployeeDto empId;
}
