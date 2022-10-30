package com.example.studenthubapi.resources;

import com.example.studenthubapi.entity.Batch;
import com.example.studenthubapi.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/batch")
public class BatchResource {
    @Autowired
    private BatchService batchService;

    @PostMapping("/addBatch")
    public Batch addBatch(@RequestBody Batch batch){
        return batchService.addorUpdateBatch(batch);
    }

    @PostMapping("/updateBatch")
    public Batch updateBatch(@RequestBody Batch batch){
        return batchService.addorUpdateBatch(batch);
    }

    @GetMapping("/allBatches")
    public List<Batch> getAllBatch(){
        return batchService.getAllBatches();
    }

    @GetMapping("/getByBatchName")
    public List<Batch> getBatchesByName(@RequestParam String batchName){
        return batchService.getBatchesByBatchName(batchName);
    }

}
