package com.example.studenthubapi.repository;

import com.example.studenthubapi.entity.Batch;
import com.example.studenthubapi.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepo extends JpaRepository<Lesson,Long> {
    public List<Lesson> findByBatch(Batch batch);
}
