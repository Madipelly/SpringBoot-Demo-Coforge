package com.example.spring_demo_coforge.repository;

import com.example.spring_demo_coforge.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
