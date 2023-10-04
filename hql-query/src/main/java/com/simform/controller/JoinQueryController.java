package com.simform.controller;

import com.simform.service.JoinQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept/teachers")
public class JoinQueryController {

    @Autowired
    private JoinQueryService joinQueryService;

    @GetMapping("/left")
    public ResponseEntity<List<?>> getDeptEmployeesLeftJoin() {
        return new ResponseEntity<List<?>>(joinQueryService.getDeptEmployeesLeftJoin(), HttpStatus.OK);
    }

    @GetMapping("/right")
    public ResponseEntity<List<?>> getDeptEmployeesRightJoin() {
        return new ResponseEntity<List<?>>(joinQueryService.getDeptEmployeesRightJoin(), HttpStatus.OK);
    }

    @GetMapping("/inner")
    public ResponseEntity<List<?>> getDeptEmployeesInnerJoin() {
        return new ResponseEntity<List<?>>(joinQueryService.getDeptEmployeesInnerJoin(), HttpStatus.OK);
    }

    @GetMapping("/cross")
    public ResponseEntity<List<?>> getDeptEmployeesCrossJoin() {
        return new ResponseEntity<List<?>>(joinQueryService.getDeptEmployeesCrossJoin(), HttpStatus.OK);
    }
}
