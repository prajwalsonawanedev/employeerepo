package com.example.employeeManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PositionTbl")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    private Integer positionId;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "no_of_position")
    private Integer noOfPosition;

    @Column(name = "budget")
    private String budget;

    @Column(name = "location")
    private String location;

    @Column(name = "base_location")
    private String baseLocation;

    @Column(name = "department")
    private String department;

    @Column(name = "employment_type", nullable = false)
    private String employementType;

    @Column(name = "additional_information", columnDefinition = "TEXT")
    private String additionalInformation;

    @Column(name = "benefits")
    private String benifites;

    @Column(name = "notice_period")
    private String noticePeriod;

    @Column(name = "is_immediate_joiner")
    private boolean isImmediateJoiner;

    @OneToOne(mappedBy = "position", cascade = CascadeType.ALL)
    @JsonIgnore
    private Criteria criteria;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Candidate> candidateList = new ArrayList<>();
}
