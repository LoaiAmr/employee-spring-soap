package com.training.employeespringsoap.endpoint;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.training.employeespringsoap.employee.EmployeeDetails;
import com.training.employeespringsoap.employee.EmployeeDetailsRequest;
import com.training.employeespringsoap.employee.EmployeeDetailsResponse;
import com.training.employeespringsoap.employee.EmployeePostRequest;
import com.training.employeespringsoap.model.Employee;
import com.training.employeespringsoap.repository.EmployeeRepository;
import com.training.employeespringsoap.service.EmployeeService;

@Endpoint
public class EmployeeDetailsEndpoint {

	@Autowired
	private EmployeeService employeeService;

	@PayloadRoot(namespace = "http://in28minutes.com/employee", localPart = "EmployeeDetailsRequest")
	@ResponsePayload
	public EmployeeDetailsResponse processEmployeeDetailsRequest(@RequestPayload EmployeeDetailsRequest request) {
		
		EmployeeDetailsResponse response = new EmployeeDetailsResponse();

		EmployeeDetails employeeDetails = employeeService.findEmployeeById(request.getEmpId());

		response.setEmployeeDetails(employeeDetails);

		return response;
	}
	
	@PayloadRoot(namespace = "http://in28minutes.com/employee", localPart = "EmployeePostRequest")
	@ResponsePayload
	public EmployeeDetailsResponse processEmployeePostRequest(@RequestPayload EmployeePostRequest request) {
		
		EmployeeDetailsResponse response = new EmployeeDetailsResponse();

		EmployeeDetails employeeDetails = employeeService.saveEmployee(request);

		response.setEmployeeDetails(employeeDetails);

		return response;
	}
	
	
}
