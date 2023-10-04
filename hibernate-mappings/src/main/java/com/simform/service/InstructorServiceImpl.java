package com.simform.service;

import com.simform.dto.InstructorDTO;
import com.simform.entity.Instructor;
import com.simform.entity.InstructorDetail;
import com.simform.exception.ResourceNotFoundException;
import com.simform.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor getInstructor(Long instructorId) {
        Optional<Instructor> instructor = instructorRepository.findById(instructorId);
        if (instructor.isEmpty()) {
            throw new ResourceNotFoundException("No Instructor Found For Provided Id");
        }
        return instructor.get();
    }

    @Override
    public Instructor addInstructor(InstructorDTO instructorDTO) {
        Instructor instructor = new Instructor();
        instructor.setFirstName(instructorDTO.getFirstName());
        instructor.setLastName(instructorDTO.getLastName());

        InstructorDetail instructorDetail = new InstructorDetail();
        instructorDetail.setHobby(instructorDTO.getHobby());

        instructor.setInstructorDetail(instructorDetail);

        return instructorRepository.save(instructor);
    }
}
