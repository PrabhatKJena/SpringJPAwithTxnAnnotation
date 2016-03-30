package edu.pk.spring.test;

import edu.pk.spring.core.Confiuration;
import edu.pk.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class MainTest {
    @Autowired
    EmployeeService employeeService;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Confiuration.class);
        MainTest test = applicationContext.getBean(MainTest.class);

        System.out.println("Before Call >>>>>>>>>>>>>>>");
        test.employeeService.insertEmployee();
        test.employeeService.listDepts();
        System.out.println("After Call >>>>>>>>>>>>>>>");
    }
}
