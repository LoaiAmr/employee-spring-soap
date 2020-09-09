package com.training.employeespringsoap.endpoint;

import java.util.ArrayList;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.training.employeespringsoap.company.CompanyDetails;
import com.training.employeespringsoap.company.CompanyDetailsRequest;
import com.training.employeespringsoap.company.CompanyDetailsResponse;
import com.training.employeespringsoap.employee.EmployeeDetails;
import com.training.employeespringsoap.employee.EmployeeDetailsRequest;
import com.training.employeespringsoap.employee.EmployeeDetailsResponse;
import com.training.employeespringsoap.model.Employee;

@Endpoint
public class CompanyDetailsEndpoint {

	@PayloadRoot(namespace = "http://in28minutes.com/company", localPart = "CompanyDetailsRequest")
	@ResponsePayload
	public CompanyDetailsResponse processCompanyDetailsRequest(@RequestPayload CompanyDetailsRequest request) {
		CompanyDetailsResponse response = new CompanyDetailsResponse();

		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setCompanyId(request.getcompanyId());
		companyDetails.setCompanyName("Datagear bi");
		companyDetails.setOwnerName("Loai");

		EmployeeDetails ahmed = new EmployeeDetails();
		ahmed.setEmpId((long) 5);
		ahmed.setUsername("ahmed");
		ahmed.setEmail("ahmed@ahmed.com");

		EmployeeDetails mohamed = new EmployeeDetails();
		mohamed.setEmpId((long) 10);
		mohamed.setUsername("mohamed");
		mohamed.setEmail("mohamed@mohamed.com");

		ArrayList<EmployeeDetails> employeeDetailsList = new ArrayList<>();
		employeeDetailsList.add(ahmed);
		employeeDetailsList.add(mohamed);

		companyDetails.setEmployee(employeeDetailsList);

		response.setCompanyDetails(companyDetails);

		return response;
	}
}
