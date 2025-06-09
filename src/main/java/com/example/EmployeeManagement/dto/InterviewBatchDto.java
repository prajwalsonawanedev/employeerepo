package com.example.EmployeeManagement.dto;

import java.util.List;

public class InterviewBatchDto {

    public Integer batchId;
    public String batchName;
    public String batchDescription;
    public String batchMode;
    public Integer batchSize;
    public String batchStartTime;
    public String batchEndTime;
    //    public List<Interviewers> interviewersList;
    public List<CandidateDto> candidateDtoList;
    public String batchLocation;

}
