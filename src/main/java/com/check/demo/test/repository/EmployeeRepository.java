package com.check.demo.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.check.demo.test.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
