package edu.pk.spring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    Integer empId;
    String fName;
    Double salary;
    Date hireDate;

    @ManyToOne(targetEntity = Dept.class)
    @JoinColumn(name = "DEPTID")
    Dept dept;

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
