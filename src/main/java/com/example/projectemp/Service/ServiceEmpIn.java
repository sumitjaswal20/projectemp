package com.example.projectemp.Service;

import com.example.projectemp.model.Employee;
import com.example.projectemp.repository.EmployeeJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmpIn implements ServiceEmp{
    @Autowired
    EmployeeJpaRepo employeeJpaRepo;
    @Override
    public List<Employee> showemp() {
        return employeeJpaRepo.findAll();

    }
    @Override
    public Employee addemp(Employee employee) {
        employeeJpaRepo.save(employee);
        return null;
    }


}
