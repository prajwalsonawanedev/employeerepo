package com.example.EmployeeManagement.dto;

import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewBatchDto {

    public Integer interviewBatchId;
    public List<InterviwerDto> interviewersList;
    public List<CandidateDto> candidateDtoList;

}
