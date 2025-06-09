package com.example.EmployeeManagement.dto;

import com.example.EmployeeManagement.annotation.NullOrInRange;
import com.example.EmployeeManagement.annotation.NullOrNotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {

    public Integer id;
    @NullOrNotBlank(min = 4,max = 20,message = "Full Name required and must be between {min} and {max} characters",isMandatory = "yes")
    public String fullName;
    @NullOrInRange(min = 10, max = 13, message = "Please provide valid mobile number", isMandatory = "yes")
    public String mobileNumber;
    @NullOrNotBlank(min = 2,max = 20,message = "Email address is required and must be between {min} and {max} characters",isEmail = "yes")
    public String emailId;
    public String DateOfBirth;
    public boolean isCandidateExperienced;
    public String currentOrganizationName;
    public Integer totalYearsOfExperience;
    @NullOrNotBlank(min = 2,max = 10,message = "Primary skills are required and must be between {min} and {max} characters",isMandatory = "yes")
    public String primarySkill;
    public Integer currentCTC;
    public String expectedCTC;
    public Integer noticePeriod;
    public Integer currentLocation;
    public String uploadCV;
    public boolean isReadyToReallocate;
}
