package com.simform.hibernate.service;

import com.simform.hibernate.dto.EmployeeDTO;
import com.simform.hibernate.entity.Employee;

public interface EmployeeService {
    Iterable<Employee> getAllEmployee();

    Employee saveEmployee(EmployeeDTO employeeDTO);

    Employee getEmployeeById(Long id);
}
