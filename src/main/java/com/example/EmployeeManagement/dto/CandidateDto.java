package com.example.EmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDto {

    public Integer id;
    public String fullName;
    public String contactNumber;
    public String emailId;
    public String DateOfBirth;
    public boolean isCandidateExperienced;
    public String currentOrganizationName;
    public Integer totalYearsOfExperience;
    public String primarySkill;
    public Integer currentCTC;
    public String expectedCTC;
    public Integer noticePeriod;
    public Integer currentLocation;
    public String uploadCV;
    public boolean isReadyToReallocate;
}
