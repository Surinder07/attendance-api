package com.example.studenthubapi.resources;

import com.example.studenthubapi.dto.EnrollmentDTO;
import com.example.studenthubapi.service.EnrollmentRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentRegisterResource {

    @Autowired
    private EnrollmentRegisterService enrollmentRegisterService;

    @PostMapping("/enrollStudent")
    public String enrollStudent(@RequestBody EnrollmentDTO enrollmentDTO){
        Boolean result = enrollmentRegisterService.enrollStudent(enrollmentDTO);
        if(result){
            return "Success: Student enrolled in batch successfully";
        }
        else{
            return "Failure: Student is not enrolled in batch successfully";
        }
    }
}
