package com.example.studenthubapi.repository;

import com.example.studenthubapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Query("Select s from Student s where s.firstName like %:firstName%")
    public List<Student> findByFirstNameContaining(String firstName);

    @Query("Select s from Student s where s.lastName like %:lastName%")
    public List<Student> findByLastNameContaining(String lastName);
}
