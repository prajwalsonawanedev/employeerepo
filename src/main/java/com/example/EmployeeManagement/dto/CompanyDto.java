package com.example.EmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {

    public Integer companyId;
    public String companyName;
    public String size;
    public String address;
    public String contactNumber;
    public String companyType;
    public String email;
    public List<DepartmentDto> departmentDtoList;
    public List<EmployeeDto> employeeDtoList;
}
