package com.example.studenthubapi.resources;

import com.example.studenthubapi.dto.AttendanceDTO;
import com.example.studenthubapi.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceResource {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/insert")
    public String insertAttendance(@RequestBody AttendanceDTO attendenceDTO){
        Boolean result = attendanceService.insertAttendance(attendenceDTO);
        if(result){
            return "Success: Attendance has been added successfully";
        }
        else{
            return "Failure: Attendance has not been added successfully";
        }
    }

    public String insertAllAttendance(@RequestBody List<AttendanceDTO> attendenceDTOs){
        Boolean result = attendanceService.insertAllAttendance(attendenceDTOs);
        if(result){
            return "Success: Attendance has been added successfully";
        }
        else{
            return "Failure: Attendance has not been added successfully";
        }
    }


}
