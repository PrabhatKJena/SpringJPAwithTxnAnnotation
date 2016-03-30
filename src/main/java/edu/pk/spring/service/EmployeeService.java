package edu.pk.spring.service;

import edu.pk.spring.entity.Dept;
import edu.pk.spring.entity.Employee;
import edu.pk.spring.repository.DeptRepository;
import edu.pk.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DeptRepository deptRepository;
    @Transactional
    public void insertEmployee() {
        System.out.println("In Service >>>>>>>>>>>>>>>");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Employee employee = new Employee();
        employee.setEmpId(600);
        employee.setfName("FTest");
        employee.setHireDate(new Date());
        employeeRepository.save(employee);

        Dept dept = new Dept();
        dept.setDeptId(500);
        dept.setDeptName("TEST DEPT");
        deptRepository.save(dept);
        System.out.println("Out Service >>>>>>>>>>>>>>>");

    }
    @Async
    public void listDepts(){
        System.out.println("In Service >>>>>>>>>>>>>>>");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Dept> depts = new ArrayList<>();//deptRepository.findAll();
        depts.forEach(d-> {
            System.out.println(d.getDeptName()+" --> ");
            d.getEmployee().forEach(e-> System.out.println("\t\t"+e.getfName()));
        });
        System.out.println("Out Service >>>>>>>>>>>>>>>");
    }
}
