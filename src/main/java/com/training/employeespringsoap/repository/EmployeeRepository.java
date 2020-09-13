package com.training.employeespringsoap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.employeespringsoap.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
