package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrInRange;
import com.example.employeeManagement.annotation.NullOrNotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDto {

    public Integer employeeId;

    @NullOrNotBlank(min = 5,max = 50,message = "Full Name is required and  must be between {min} and {max} characters",isMandatory = "yes")
    public String fullName;
    @NullOrNotBlank(min = 1,max = 20,message = "Position Name is required and must be between {min} and {max} characters",isMandatory = "yes")
    public String position;
    public String dateOfJoining;
    public String adharCardNo;
    public String panCardNo;
    public String salary;
    @NullOrNotBlank(min = 1,max = 10,message = "Gender required and must be between {min} and {max} characters",isMandatory = "yes")
    public String gender;
    public boolean maritalStatus;
    public String spouseName;
    @NullOrInRange(min = 10,max = 14,message = "Personal Mobile Number is required and  must be between {min} and {max} characters",isMandatory = "yes")
    public String personalMobileNumber;
    @NullOrNotBlank(min = 10,max = 14,message = "Working Mobile Number is required and  must be between {min} and {max} characters",isMandatory = "yes")
    public String workMobileNumber;
    @NullOrNotBlank(min = 5,max = 50,message = "Mobile Number is required and  must be between {min} and {max} characters",isMandatory = "yes")
    public String permanentAddress;
    public String addressStreet1;
    public String addressStreet2;
    public String addressApartment;
    public String addressCity;
    public String addressState;
    public String addressCountry;
    @NullOrInRange(min = 6,max = 6,message = "pincode is required and must be 6 digit",isMandatory = "yes")
    public String addressPincode;
    public String temporaryAddress;
    @NullOrNotBlank(isEmail = "yes")
    public String personalEmailId;
    @NullOrNotBlank(isEmail = "yes")
    public String companyEmailId;
    @NullOrNotBlank(min = 1,max = 10,message = "Mother Name and must be between {min} and {max} characters",isMandatory = "yes")
    public String motherFullName;
    @NullOrNotBlank(min = 1,max = 10,message = "Father Name is required and must be between {min} and {max} characters",isMandatory = "yes")
    public String fatherFullName;
    public String profileId;
    public String location;
    public String terminatedDate;
    public String healthIssue;
    public String healthDescription;
    public CompanyDto companyDto;
    public DepartmentCategoryDto departmentCategoryDto;

}
