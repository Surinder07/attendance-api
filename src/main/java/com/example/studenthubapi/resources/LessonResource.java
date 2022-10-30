package com.example.studenthubapi.resources;

import com.example.studenthubapi.entity.Lesson;
import com.example.studenthubapi.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/lesson")
public class LessonResource {

    @Autowired
    private LessonService lessonService;

    @PostMapping("/create")
    public Optional<Lesson> createLesson(@RequestParam Long batchId){
        return lessonService.createLesson(batchId);
    }

    @GetMapping("/getLessonsByBatchId")
    public List<Lesson> findLessonByBatchId(@RequestParam Long batchId){
        return lessonService.findLessonsbyBatch(batchId);
    }

    public Boolean deleteLesson(@RequestParam Long lessonId){
        return lessonService.deleteLesson(lessonId);
    }
}
