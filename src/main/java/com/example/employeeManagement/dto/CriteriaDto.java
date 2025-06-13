package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrNotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CriteriaDto {

    private Integer criteriaId;
    @NullOrNotBlank(min = 2, max = 10, message = "Primary Skills are required and must be between {min} and {max} characters", isMandatory = "yes")
    private String primarySkill;
    private String experienceLevel;
    @NullOrNotBlank(min = 2, max = 10, message = "Tools and Technologies are required and must be between {min} and {max} characters", isMandatory = "yes")
    private String toolsAndTechnologies;
    private boolean isHybrid;
    private boolean isWFH;
    private boolean isStricktlyOffice;
    private boolean isclientLocation;
    @NullOrNotBlank(min = 2, max = 10, message = "Rolls and responsibilities are required and must be between {min} and {max} characters", isMandatory = "yes")
    private String rollsAndResponsibilities;
    private String requiredQualification;
    private String preferredQualification;
    private boolean isShiftTimming;
    private String language;

    private PositionDto positionDto;
}
