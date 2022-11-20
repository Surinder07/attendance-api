package com.example.studenthubapi.resources;

import com.example.studenthubapi.entity.Lesson;
import com.example.studenthubapi.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lesson")
public class LessonResource {

    @Autowired
    private LessonService lessonService;

    @PostMapping("/create")
    public Optional<Lesson> createLesson(@RequestParam(name = "batchId") Long batchId){
        return lessonService.createLesson(batchId);
    }



    @GetMapping("/getLessonsByBatchId")
    public List<Lesson> findLessonByBatchId(@RequestParam Long batchId){
        return lessonService.findLessonsbyBatch(batchId);
    }


    @GetMapping("/all")
    public List<Lesson> findAllLessons(){
        return lessonService.findAllLessons();
    }

    public Boolean deleteLesson(@RequestParam Long lessonId){
        return lessonService.deleteLesson(lessonId);
    }
}
