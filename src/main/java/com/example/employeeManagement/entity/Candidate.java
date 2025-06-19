package com.example.employeeManagement.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "candidateTbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidateId;

    @Column(name = "candidate_name", nullable = false, length = 50)
    private String candidateName;

    @Column(name = "mobile_number", nullable = false, length = 14)
    private String mobileNumber;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "is_candidate_experienced")
    private boolean isCandidateExperienced;

    @Column(name = "current_organization_name")
    private String currentOrganizationName;

    @Column(name = "total_years_of_experience")
    private Integer totalYearsOfExperience;

    @Column(name = "primary_skill", nullable = false, length = 40)
    private String primarySkill;

    @Column(name = "current_ctc")
    private Integer currentCTC;

    @Column(name = "expected_ctc")
    private String expectedCTC;

    @Column(name = "notice_period")
    private Integer noticePeriod;

    @Column(name = "current_location")
    private Integer currentLocation;

    @Column(name = "upload_cv")
    private String uploadCV;

    @Column(name = "is_ready_to_reallocate")
    private boolean isReadyToReallocate;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
