package com.example.studenthubapi.repository;

import com.example.studenthubapi.entity.Batch;
import com.example.studenthubapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchRepo extends JpaRepository<Batch, Long> {

//    @Query("Select b from batch b where b.batch_name like %:batchName%")
//    public List<Batch> findByBatchNameContaining(String batchName);

    public List<Batch> findByBatchName(String batchName);
}
