package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrNotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentDto {

    public Integer departmentId;
    @NullOrNotBlank(min = 2, max = 10, message = "Department Name is required and must be between {min} and {max} characters", isMandatory = "yes")
    public String departmentName;
    @NullOrNotBlank(min = 2, max = 10, message = "Department Description is required and must be between {min} and {max} characters")
    public String description;
    @NullOrNotBlank(min = 2, max = 10, message = "Department Head is required and must be between {min} and {max} characters", isMandatory = "yes")
    public String departmentHead;
    public String location;
    public Integer size;
    public List<DepartmentCategoryDto> departmentCategoryList;
    public CompanyDto companyDto;
}
