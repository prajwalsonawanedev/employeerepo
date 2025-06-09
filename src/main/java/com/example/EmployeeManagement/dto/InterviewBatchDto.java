package com.example.EmployeeManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewBatchDto {

    public Integer interviewBatchId;
    public List<InterviwerDto> interviewersList;
    public List<CandidateDto> candidateDtoList;

}
