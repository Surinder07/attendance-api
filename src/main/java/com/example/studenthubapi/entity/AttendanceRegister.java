package com.example.studenthubapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(AttendanceRegisterId.class)
@Builder
public class AttendanceRegister {

    @Id
    private Long lessonId;
    @Id
    private Long studentId;
    private Boolean isPresent;
    private LocalDate AttendanceDate;
    private AttendanceType attendanceType;
}
