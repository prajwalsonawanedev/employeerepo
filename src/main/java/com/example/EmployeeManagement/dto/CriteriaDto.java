package com.example.EmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CriteriaDto {

    public Integer criteriaId;
    public String primarySkill;
    public String experienceLevel;
    public String toolsAndTechnologies;
    public boolean isHybrid;
    public boolean isWFH;
    public boolean isStricktlyOffice;
    public boolean isclientLocation;
    public String rollsAndResponsibilities;
    public String requiredQualification;
    public String preferredQualification;
    public boolean isShiftTimming;
    public String language;

    public PositionDto positionDto;
}
