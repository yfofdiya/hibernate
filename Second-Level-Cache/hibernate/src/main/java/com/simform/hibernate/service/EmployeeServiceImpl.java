package com.simform.hibernate.service;

import com.simform.hibernate.dto.EmployeeDTO;
import com.simform.hibernate.entity.Employee;
import com.simform.hibernate.exception.EmployeeNotFoundException;
import com.simform.hibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setCity(employeeDTO.getCity());
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employeeResponse = employeeRepository.findById(id);
        if (employeeResponse.isEmpty()) {
            throw new EmployeeNotFoundException("No Employee Found For Provided Id");
        }
        Employee employee = employeeResponse.get();
        return employee;
    }
}
