package com.example.studenthubapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class LectureRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lectureRegisterId;
    private String lectureId;
    private String batchId;
    private String dateAndDay;
}
