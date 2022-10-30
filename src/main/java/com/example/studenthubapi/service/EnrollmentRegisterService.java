package com.example.studenthubapi.service;

import com.example.studenthubapi.dto.EnrollmentDTO;
import com.example.studenthubapi.entity.Batch;
import com.example.studenthubapi.entity.EnrollmentRegister;
import com.example.studenthubapi.entity.Student;
import com.example.studenthubapi.repository.EnrollmentRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EnrollmentRegisterService {

    @Autowired
    private EnrollmentRegisterRepo enrollmentRegisterRepo;

    @Autowired
    private StudentService studentService;

    @Autowired
    private BatchService batchService;

    public Boolean enrollStudent(EnrollmentDTO enrollmentDTO){
        Optional<Student> student = studentService.findStudentById(enrollmentDTO.getStudentId());
        Optional<Batch> batch = batchService.findBatchById(enrollmentDTO.getBatchId());
        if(student.isPresent() && batch.isPresent()){
            enrollmentRegisterRepo.save(EnrollmentRegister.builder()
                            .student(student.get())
                            .batch(batch.get())
                            .registerAt(LocalDateTime.now())
                            .build());
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
