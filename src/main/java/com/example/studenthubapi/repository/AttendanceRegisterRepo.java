package com.example.studenthubapi.repository;

import com.example.studenthubapi.entity.AttendanceRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRegisterRepo extends JpaRepository<AttendanceRegister, Long> {
}
