package org.tjempdl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tjempdl.entity.Employee;
import org.tjempdl.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public ResponseEntity<List<Employee>> getAll()
    {
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Integer id)
    {
        return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> save(@RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.addEmployee(employee),HttpStatus.CREATED);
    }
}
