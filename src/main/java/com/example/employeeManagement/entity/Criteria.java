package com.example.employeeManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CriteriaTbl")
public class Criteria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "criteria_id")
    private Integer criteriaId;

    @Column(name = "primary_skill", nullable = false, length = 50)
    private String primarySkill;

    @Column(name = "experience_level")
    private String experienceLevel;

    @Column(name = "tools_and_technologies", nullable = false)
    private String toolsAndTechnologies;

    @Column(name = "is_hybrid")
    private boolean isHybrid;

    @Column(name = "is_wfh")
    private boolean isWFH;

    @Column(name = "is_strictly_office")
    private boolean isStricktlyOffice;

    @Column(name = "is_client_location")
    private boolean isclientLocation;

    @Column(name = "roles_and_responsibilities", nullable = false)
    private String rollsAndResponsibilities;

    @Column(name = "required_qualification")
    private String requiredQualification;

    @Column(name = "preferred_qualification")
    private String preferredQualification;

    @Column(name = "is_shift_timing")
    private boolean isShiftTimming;

    @Column(name = "language")
    private String language;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id", nullable = false)
    @JsonManagedReference
    private Position position;
}
