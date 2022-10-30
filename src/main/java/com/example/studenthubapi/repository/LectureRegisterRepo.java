package com.example.studenthubapi.repository;

import com.example.studenthubapi.entity.LectureRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRegisterRepo extends JpaRepository<LectureRegister,Long> {
}
