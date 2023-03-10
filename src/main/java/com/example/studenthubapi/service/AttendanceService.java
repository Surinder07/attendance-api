package com.example.studenthubapi.service;

import com.example.studenthubapi.dto.AttendanceDTO;
import com.example.studenthubapi.entity.AttendanceRegister;
import com.example.studenthubapi.entity.AttendanceType;
import com.example.studenthubapi.repository.AttendanceRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRegisterRepo attendanceRegisterRepo;

    public Boolean insertAttendance(AttendanceDTO attendenceDTO){
        try {
            Long lessonId = attendenceDTO.getLessonId();
            Long studentId = attendenceDTO.getStudentId();
            String attendanceType = attendenceDTO.getAttendanceType();
            AttendanceType attandType = AttendanceType.online;
            if (attendanceType.equalsIgnoreCase("inclass")) {
                attandType = AttendanceType.inClass;
            }
            AttendanceRegister attandence = AttendanceRegister.builder()
                    .lessonId(lessonId)
                    .studentId(studentId)
                    .isPresent(Boolean.TRUE)
                    .attendanceType(attandType)
                    .AttendanceDate(LocalDate.now())
                    .build();
            attendanceRegisterRepo.save(attandence);
            return Boolean.TRUE;
        } catch (Exception exception){
            return Boolean.FALSE;
        }
    }

    public Boolean insertAllAttendance(List<AttendanceDTO> attendenceDTOs){
        Boolean result = Boolean.TRUE;
        for(AttendanceDTO attendenceDTO : attendenceDTOs){
            if(insertAttendance(attendenceDTO) == Boolean.FALSE){
                result = Boolean.FALSE;
            }
        }
        return result;
    }
}
