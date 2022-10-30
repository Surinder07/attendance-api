package com.example.studenthubapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long enrollmentRegisterId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;


    private LocalDateTime registerAt;
}
