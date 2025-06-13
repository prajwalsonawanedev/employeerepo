package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrNotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {

    public Integer companyId;
    @NullOrNotBlank(min = 4,max = 50,message = "Company Name is required and must be between {min} and {max} characters",isMandatory = "yes")
    public String name;
    public String description;
    public Integer size;
    @NullOrNotBlank(min = 4,max = 50,message = "Company Address is required must be between {min} and {max} characters",isMandatory = "yes")
    public String address;
    public String contactNumber;
    public String companyType;
    @NullOrNotBlank(min = 4,max = 50,message = "Company Email address is required must be between {min} and {max} characters",isEmail = "yes")
    public String email;
    public List<DepartmentDto> departmentList;
    public List<EmployeeDto> employeeList;
}
