package com.example.EmployeeManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentCategoryDto {

    public Integer dCategoryId;
    public String categoryName;
    public String description;
    public String manager;
    public String location;
    public Integer size;
    public DepartmentDto departmentDto;
    public List<EmployeeDto> employeeDtoList;
}