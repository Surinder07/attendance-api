package com.example.studenthubapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Batch {

    @Id
    private String batchId;
    private String batchName;
    // string or int
    private String batchNumber;
    private Date startDate;
    private Date endDate;
    private String duration;
    private String instructor;

}
