package edu.pk.spring.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "DEPT")
public class Dept {
    @Id
    Integer deptId;
    String deptName;
    String location;
    Integer empId;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @OneToMany(targetEntity = Employee.class, mappedBy = "dept", fetch = FetchType.EAGER)
    private Collection<Employee> employee;

    public Collection<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Collection<Employee> employee) {
        this.employee = employee;
    }
}
