package com.simform.controller;

import com.simform.dto.InstructorDTO;
import com.simform.entity.Instructor;
import com.simform.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping
    public List<Instructor> getInstructors() {
        return instructorService.getInstructors();
    }

    @GetMapping("/{id}")
    public Instructor getInstructor(@PathVariable(value = "id") Long instructorId) {
        return instructorService.getInstructor(instructorId);
    }

    @PostMapping
    public Instructor addInstructor(@RequestBody InstructorDTO instructorDTO) {
        return instructorService.addInstructor(instructorDTO);
    }

}
