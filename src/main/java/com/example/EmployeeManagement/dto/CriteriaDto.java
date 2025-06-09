package com.example.EmployeeManagement.dto;

import com.example.EmployeeManagement.annotation.NullOrNotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CriteriaDto {

    public Integer criteriaId;
    @NullOrNotBlank(min = 2, max = 10, message = "Primary Skills are required and must be between {min} and {max} characters", isMandatory = "yes")
    public String primarySkill;
    public String experienceLevel;
    @NullOrNotBlank(min = 2, max = 10, message = "Tools and Technologies are required and must be between {min} and {max} characters", isMandatory = "yes")
    public String toolsAndTechnologies;
    public boolean isHybrid;
    public boolean isWFH;
    public boolean isStricktlyOffice;
    public boolean isclientLocation;
    @NullOrNotBlank(min = 2, max = 10, message = "Rolls and responsibilities are required and must be between {min} and {max} characters", isMandatory = "yes")
    public String rollsAndResponsibilities;
    public String requiredQualification;
    public String preferredQualification;
    public boolean isShiftTimming;
    public String language;

    public PositionDto positionDto;
}
