package com.example.EmployeeManagement.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PositionDto {

    public Integer positionId;
    public String title;
    public String description;
    public Integer noOfPosition;
    public String budget;
    public String location;
    public String baseLocation;
    public String department;
    public String employementType;
    public String additionalInformation;
    public String benifites;
    public String noticePeriod;
    public boolean isImmediateJoiner;
}
