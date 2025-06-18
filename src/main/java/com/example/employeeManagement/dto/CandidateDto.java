package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrInRange;
import com.example.employeeManagement.annotation.NullOrNotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CandidateDto {

    private Long candidateId;

    @NullOrNotBlank(min = 4, max = 50, message = "Candidate Name required and must be between {min} and {max} characters", isMandatory = "yes")
    private String candidateName;

    @NullOrInRange(min = 10, max = 14, message = "Please provide valid mobile number", isMandatory = "yes")
    private String mobileNumber;

    @NullOrNotBlank(min = 2, max = 40, message = "Please provide valid email address for Candidate and must be between {min} and {max} characters", isEmail = "yes", isMandatory = "yes")
    private String emailId;

    private String dateOfBirth;

    private boolean isCandidateExperienced;

    private String currentOrganizationName;

    private Integer totalYearsOfExperience;

    @NullOrNotBlank(min = 2, max = 40, message = "Primary skills are required and must be between {min} and {max} characters", isMandatory = "yes")
    private String primarySkill;

    private Integer currentCTC;

    private String expectedCTC;

    private Integer noticePeriod;

    private Integer currentLocation;

    private String uploadCV;

    private boolean isReadyToReallocate;

    private PositionDto position;
}
