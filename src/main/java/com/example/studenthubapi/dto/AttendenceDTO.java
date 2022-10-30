package com.example.studenthubapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendenceDTO {
    private Long lessonId;
    private Long studentId;
    private String attendaceType;
}
