package com.example.EmployeeManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}