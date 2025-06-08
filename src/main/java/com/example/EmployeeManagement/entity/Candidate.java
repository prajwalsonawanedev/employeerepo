package com.example.EmployeeManagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cadidateTbl")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "candidateid")
    public Integer candidateId;

    @Column(name = "candidatename")
    public String candidateName;

    @Column(name = "candidatestream")
    public String candidateStream;

    @Column(name = "candidateage")
    public Integer candiateAge;

    @Column(name = "candidatemaritalstaus")
    public String candidateMaritalStaus;

    @Column(name = "candidategender")
    public String candidateGender;

    @Column(name = "candidatestatus")
    public String candidateStatus;

}
