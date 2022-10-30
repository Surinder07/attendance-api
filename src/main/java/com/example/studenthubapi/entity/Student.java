package com.example.studenthubapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Student {
    @Id
    private String studentId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
}
