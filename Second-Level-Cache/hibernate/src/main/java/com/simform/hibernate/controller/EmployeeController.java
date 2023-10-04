package com.simform.hibernate.controller;

import com.simform.hibernate.dto.EmployeeDTO;
import com.simform.hibernate.entity.Employee;
import com.simform.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee() {
        Iterable<Employee> employees = employeeService.getAllEmployee();
        List<Employee> data = StreamSupport
                .stream(employees.spliterator(), false)
                .collect(Collectors.toList());
        return data;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }
}
