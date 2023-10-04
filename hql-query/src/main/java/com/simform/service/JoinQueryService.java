package com.simform.service;

import com.simform.repository.DepartmentRepository;
import com.simform.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinQueryService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    public List<?> getDeptEmployeesLeftJoin() {
        List<?> list = departmentRepository.fetchTeaDeptDataLeftJoin();
        return list;
    }

    public List<?> getDeptEmployeesRightJoin() {
        List<?> list = departmentRepository.fetchTeaDeptDataRightJoin();
        return list;
    }

    public List<?> getDeptEmployeesInnerJoin() {
        List<?> list = teacherRepository.fetchTeaDeptDataInnerJoin();
        return list;
    }

    public List<?> getDeptEmployeesCrossJoin() {
        List<?> list = teacherRepository.fetchTeaDeptDataCrossJoin();
        return list;
    }
}
