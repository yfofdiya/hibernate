package com.simform.service;

import com.simform.dto.InstructorDTO;
import com.simform.entity.Instructor;

import java.util.List;

public interface InstructorService {
    List<Instructor> getInstructors();

    Instructor getInstructor(Long instructorId);

    Instructor addInstructor(InstructorDTO instructorDTO);
}
