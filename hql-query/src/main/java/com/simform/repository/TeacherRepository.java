package com.simform.repository;

import com.simform.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query("SELECT d.name, t.name, t.email FROM Department d INNER JOIN d.teachers t")
    List<?> fetchTeaDeptDataInnerJoin();

    @Query("SELECT d.name, t.name, t.email FROM Department d, Teacher t")
    List<?> fetchTeaDeptDataCrossJoin();

}