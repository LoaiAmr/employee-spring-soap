package com.training.employeespringsoap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.training.employeespringsoap.employee.EmployeeDetails;
import com.training.employeespringsoap.employee.EmployeeDetailsRequest;
import com.training.employeespringsoap.employee.EmployeeDetailsResponse;

@Endpoint
public class EmployeeDetailsEndpoint {

	@PayloadRoot(namespace = "http://in28minutes.com/employee", localPart = "EmployeeDetailsRequest")
	@ResponsePayload
	public EmployeeDetailsResponse processEmployeeDetailsRequest(@RequestPayload EmployeeDetailsRequest request) {
		EmployeeDetailsResponse response = new EmployeeDetailsResponse();

		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmpId(request.getEmpId());
		employeeDetails.setUsername("Loai");
		employeeDetails.setEmail("loai@loai.com");

		response.setEmployeeDetails(employeeDetails);

		return response;
	}
}
