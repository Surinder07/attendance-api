package com.example.studenthubapi.service;

import com.example.studenthubapi.entity.Student;
import com.example.studenthubapi.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student addOrUpdateStudent(Student student){
        studentRepo.save(student);
        return student;
    }

    public Set<Student> getStudentsByName(String name){
        Set<Student> students = new HashSet<>();
        students.addAll(studentRepo.findByFirstNameContaining(name));
        students.addAll(studentRepo.findByLastNameContaining(name));
        return students;
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Optional<Student> findStudentById(Long id){
        return studentRepo.findById(id);
    }

}
