package com.example.studenthubapi.entity;

import lombok.Data;

@Data
public class AttendanceRegister {
    private String lectureId;
    private String studentId;
    private Boolean isPresent;
}
