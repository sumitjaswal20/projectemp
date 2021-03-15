package com.example.projectemp.repository;

import com.example.projectemp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepo extends JpaRepository<Employee,Long> {
}
