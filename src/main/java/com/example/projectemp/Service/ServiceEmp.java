package com.example.projectemp.Service;

import com.example.projectemp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceEmp {
    Employee addemp(Employee employee);
    List<Employee> showemp();
}
