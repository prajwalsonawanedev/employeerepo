package com.example.EmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentDto {

    public Integer departmentId;
    public String departmentName;
    public String description;
    public String departmentHead;
    public String location;
    public Integer size;
    public List<DepartmentCategoryDto> departmentCategoryDtoList;
    public CompanyDto companyDto;
}
