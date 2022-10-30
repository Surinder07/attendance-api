package com.example.studenthubapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long batchId;

    private String batchName;
    private Integer batchNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private String duration;
    private String instructor;

    @OneToMany(mappedBy = "batch")
    private Set<EnrollmentRegister> registrations;

}
