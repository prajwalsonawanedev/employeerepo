package com.example.employeeManagement.dto;

import com.example.employeeManagement.annotation.NullOrNotBlank;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchDto {

    public Integer batchId;
    @NullOrNotBlank(min = 1,max = 10,message = "Batch Name required and must be between {min} and {max} characters",isMandatory = "yes")
    public String batchName;
    @NullOrNotBlank(min = 4,max = 10,message = "Batch Description is required and must be between {min} and {max} characters",isMandatory = "yes")
    public String batchDescription;
    public String batchMode;
    public Integer batchSize;
    public String batchStartTime;
    public String batchEndTime;
    public String batchLocation;

}
