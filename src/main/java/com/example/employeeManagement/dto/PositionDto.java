package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrNotBlank;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PositionDto {

    public Integer positionId;
    @NullOrNotBlank(min = 2, max = 10, message = "Position title is required and must be between {min} and {max} characters", isMandatory = "yes")
    public String title;
    @NullOrNotBlank(min = 2, max = 10, message = "Position Description is required and must be between {min} and {max} characters", isMandatory = "yes")
    public String description;
    public Integer noOfPosition;
    public String budget;
    public String location;
    public String baseLocation;
    public String department;
    @NullOrNotBlank(min = 2, max = 10, message = "EmployementType is required and must be between {min} and {max} characters", isMandatory = "yes")
    public String employementType;
    public String additionalInformation;
    public String benifites;
    public String noticePeriod;
    public boolean isImmediateJoiner;

    public CriteriaDto criteria;
    public List<CandidateDto> candidateList;
}
