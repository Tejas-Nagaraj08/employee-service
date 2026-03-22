package org.tjempdl.service;

import org.tjempdl.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    Employee getEmployeeById(Integer id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Integer id, Employee employee);
    void deleteEmployee(Integer id);
}
