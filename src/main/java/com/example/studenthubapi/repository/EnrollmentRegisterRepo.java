package com.example.studenthubapi.repository;

import com.example.studenthubapi.entity.EnrollmentRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRegisterRepo extends JpaRepository<EnrollmentRegister, Long> {
}
