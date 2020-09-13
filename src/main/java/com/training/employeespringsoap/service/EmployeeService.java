package com.training.employeespringsoap.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.employeespringsoap.employee.EmployeeDetails;
import com.training.employeespringsoap.employee.EmployeePostRequest;
import com.training.employeespringsoap.model.Employee;
import com.training.employeespringsoap.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeDetails findEmployeeById(Long empId) {
		EmployeeDetails employeeDetails = new EmployeeDetails();

		
		Optional<Employee> emp = employeeRepository.findById(empId);
		employeeDetails.setEmpId((long) emp.get().getEmpId());
		employeeDetails.setEmail(emp.get().getEmail());
		employeeDetails.setUsername(emp.get().getUsername());
		
		return employeeDetails;
	}
	
	public EmployeeDetails saveEmployee(EmployeePostRequest employeePostRequest) {
		
		Employee employee = new Employee();
		employee.setEmpId(employeePostRequest.getEmpId());
		employee.setEmail(employeePostRequest.getEmail());
		employee.setUsername(employeePostRequest.getUsername());
		
		Employee empSaved = employeeRepository.save(employee);
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmpId((long) empSaved.getEmpId());
		employeeDetails.setEmail(empSaved.getEmail());
		employeeDetails.setUsername(empSaved.getUsername());
		
		return employeeDetails;
	}
}
