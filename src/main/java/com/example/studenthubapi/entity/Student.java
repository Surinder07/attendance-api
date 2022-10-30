package com.example.studenthubapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;

    @OneToMany(mappedBy = "student")
    private Set<EnrollmentRegister> registrations;
}
