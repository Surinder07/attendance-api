package com.example.studenthubapi.service;

import com.example.studenthubapi.entity.Batch;
import com.example.studenthubapi.repository.BatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BatchService {

    @Autowired
    private BatchRepo batchRepo;

    public Batch addorUpdateBatch(Batch batch){
        return batchRepo.save(batch);
    }

    public List<Batch> getAllBatches(){
        return batchRepo.findAll();
    }

    public Optional<Batch> findBatchById(Long id){
        return batchRepo.findById(id);
    }

    public List<Batch> getBatchesByBatchName(String batchName){
        return batchRepo.findByBatchNameContaining(batchName);
    }
}
