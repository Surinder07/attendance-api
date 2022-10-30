package com.example.studenthubapi.service;

import com.example.studenthubapi.entity.Batch;
import com.example.studenthubapi.entity.Lesson;
import com.example.studenthubapi.repository.BatchRepo;
import com.example.studenthubapi.repository.LessonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LessonService {

    @Autowired
    private LessonRepo lessonRepo;

    @Autowired
    private BatchService batchService;

    public Optional<Lesson> createLesson(Long batchId){
        Optional<Batch> batch = batchService.findBatchById(batchId);
        if(batch.isPresent()){
            LocalDate todayDateObj = LocalDate.now();
            String todayDate = todayDateObj.toString();
            String todayDay = todayDateObj.getDayOfWeek().toString();
            String dateAndDay = todayDate + " " + todayDay;
            Lesson lesson = Lesson.builder().batch(batch.get()).dateAndDay(dateAndDay).build();
            return Optional.of(lessonRepo.save(lesson));
        }
        return Optional.empty();
    }

    public Boolean deleteLesson(Long lessonId){
        try {
            lessonRepo.deleteById(lessonId);
            return true;
        } catch (Exception exception){
            return false;
        }
    }

    public List<Lesson> findLessonsbyBatch(Long batchId){
        Optional<Batch> batch = batchService.findBatchById(batchId);
        if(batch.isPresent()){
            return lessonRepo.findByBatch(batch.get());
        }
        else {
            return new ArrayList<>();
        }
    }

    public List<Lesson> findAllLessons(){
        return lessonRepo.findAll();
    }
}
