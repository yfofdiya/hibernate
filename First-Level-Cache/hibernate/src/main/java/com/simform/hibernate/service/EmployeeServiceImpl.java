package com.simform.hibernate.service;

import com.simform.hibernate.dto.EmployeeDTO;
import com.simform.hibernate.entity.Employee;
import com.simform.hibernate.exception.EmployeeNotFoundException;
import com.simform.hibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Employee employeeResponse = employeeRepository.findById(id).get();
//        if (employeeResponse.isEmpty()) {
//            throw new EmployeeNotFoundException("No Employee Found For Provided Id");
//        }
//        System.out.println("First time record will come from database");
//        System.out.println("Employee is " + employeeResponse);
//        System.out.println("Second time record will come from cache");
//        System.out.println("Employee is " + employeeResponse);
//        System.out.println("Third time record will come from cache");
//        System.out.println("Employee is " + employeeResponse.get());
//        System.out.println("Fourth time record will come from cache");
//        System.out.println("Employee is " + employeeResponse.get());
//        Employee employee = employeeResponse.get();
        return employeeResponse;
    }
}
