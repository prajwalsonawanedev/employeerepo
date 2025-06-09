package com.example.EmployeeManagement.dto;


import com.example.EmployeeManagement.annotation.NullOrNotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentCategoryDto {

    public Integer dCategoryId;
    @NullOrNotBlank(min = 2,max = 10,message = "Category Name is required and must be between {min} and {max} characters",isMandatory = "yes")
    public String categoryName;
    public String description;
    @NullOrNotBlank(min = 2,max = 10,message = "Manager Name is required and must be between {min} and {max} characters",isMandatory = "yes")
    public String manager;
    public String location;
    public Integer size;
    public DepartmentDto departmentDto;
    public List<EmployeeDto> employeeDtoList;
}