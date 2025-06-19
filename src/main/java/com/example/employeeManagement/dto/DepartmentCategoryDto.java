package com.example.employeeManagement.dto;


import com.example.employeeManagement.annotation.NullOrNotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentCategoryDto {

    private Integer deptCategoryId;
    @NullOrNotBlank(min = 2, max = 10, message = "Category Name is required and must be between {min} and {max} characters", isMandatory = "yes")
    private String deptCategoryName;
    private String deptdescription;
    @NullOrNotBlank(min = 2, max = 10, message = "Manager Name is required and must be between {min} and {max} characters", isMandatory = "yes")
    private String manager;
    private String location;
    private Integer size;
    private DepartmentDto department;
    private List<EmployeeDto> employeeList;
}