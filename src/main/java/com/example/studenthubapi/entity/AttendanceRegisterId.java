package com.example.studenthubapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceRegisterId implements Serializable {

    private Long lessonId;
    private Long studentId;
}
