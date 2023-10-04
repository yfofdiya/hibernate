package com.simform.hibernate.repository;

import com.simform.hibernate.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
