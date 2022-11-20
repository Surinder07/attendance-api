package com.example.studenthubapi.resources;

import com.example.studenthubapi.entity.Student;
import com.example.studenthubapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:3005")
@RequestMapping("/students")

public class StudentResource {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addOrUpdateStudent(student);
    }

    @PostMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.addOrUpdateStudent(student);
    }

    @GetMapping("/allStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/findByName")
    public Set<Student> findStudentsByName(@RequestParam String name){
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/findById")
    public Optional<Student> findStudentById(@RequestParam Long id){
        return studentService.findStudentById(id);
    }

}
