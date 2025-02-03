package com.example.spring_demo_coforge.service;


import com.example.spring_demo_coforge.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Long id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employeeDetails);
    void deleteEmployee(Long id);
}
