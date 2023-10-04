package com.simform.repository;

import com.simform.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d.name, t.name, t.email FROM Department d LEFT JOIN d.teachers t")
    List<?> fetchTeaDeptDataLeftJoin();

    @Query("SELECT d.name, t.name, t.email FROM Department d RIGHT JOIN d.teachers t")
    List<?> fetchTeaDeptDataRightJoin();

}
