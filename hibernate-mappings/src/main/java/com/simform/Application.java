package com.simform;

import com.simform.entity.Employee;
import com.simform.entity.Project;
import com.simform.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee = new Employee();
        employee.setFirstName("Test");
        employee.setLastName("T 1");

        Project project1 = new Project();
        project1.setTitle("Employee Management System");

        Project project2 = new Project();
        project2.setTitle("Attendance Management System");

        employee.getProjects().add(project1);
        employee.getProjects().add(project2);

        project1.getEmployees().add(employee);
        project2.getEmployees().add(employee);

        employeeRepository.save(employee);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
