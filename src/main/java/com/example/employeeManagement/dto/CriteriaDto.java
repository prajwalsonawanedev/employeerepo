package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrNotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CriteriaDto {

    private Integer criteriaId;

    @NullOrNotBlank(min = 2, max = 10, message = "Primary Skills are required and must be between {min} and {max} characters", isMandatory = "yes")
    @JsonProperty("primarySkill")
    private String primarySkill;

    @JsonProperty("experienceLevel")
    private String experienceLevel;

    @NullOrNotBlank(min = 2, max = 10, message = "Tools and Technologies are required and must be between {min} and {max} characters", isMandatory = "yes")
    @JsonProperty("toolsAndTechnologies")
    private String toolsAndTechnologies;

    @JsonProperty("isHybrid")
    private boolean isHybrid;

    @JsonProperty("isWFH")
    private boolean isWFH;

    @JsonProperty("isStricktlyOffice")
    private boolean isStricktlyOffice;

    @JsonProperty("isclientLocation")
    private boolean isclientLocation;

    @JsonProperty("rollsAndResponsibilities")
    @NullOrNotBlank(min = 2, max = 10, message = "Rolls and responsibilities are required and must be between {min} and {max} characters", isMandatory = "yes")
    private String rollsAndResponsibilities;

    @JsonProperty("requiredQualification")
    private String requiredQualification;

    @JsonProperty("preferredQualification")
    private String preferredQualification;

    @JsonProperty("isShiftTimming")
    private boolean isShiftTimming;

    @JsonProperty("language")
    private String language;

    @JsonProperty("positionDto")
    private PositionDto position;
}
