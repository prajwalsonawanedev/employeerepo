package com.example.EmployeeManagement.dto;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatchDto {

    public Integer batchId;
    public String batchName;
    public String batchDescription;
    public String batchMode;
    public Integer batchSize;
    public String batchStartTime;
    public String batchEndTime;
    public String batchLocation;

}
