package edu.pk.spring.repository;

import edu.pk.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dipti on 3/29/2016.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
