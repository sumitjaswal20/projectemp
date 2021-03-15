package com.example.projectemp.model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="newemp")
public class Employee {
    @Id
            @GeneratedValue
    Long id;
    int empno;
    String name;
    long mobno;
    int deptno;

    public Employee() {
    }

    public Employee(int empno, String name, long mobno, int deptno) {
        this.empno = empno;
        this.name = name;
        this.mobno = mobno;
        this.deptno = deptno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobno() {
        return mobno;
    }

    public void setMobno(long mobno) {
        this.mobno = mobno;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
}
