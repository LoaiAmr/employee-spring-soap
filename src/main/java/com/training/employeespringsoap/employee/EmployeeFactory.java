package com.training.employeespringsoap.employee;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class EmployeeFactory {

	/**
	 * Create a new EmployeeFactory that can be used to create new instances of
	 * schema derived classes for package: com.training.employeespringsoap.config
	 * 
	 */
	public EmployeeFactory() {
		super();
	}

	/**
	 * Create an instance of {@link EmployeeDetailsResponse }
	 * 
	 */
	public EmployeeDetailsResponse createEmployeeDetailsResponse() {
		return new EmployeeDetailsResponse();
	}

	/**
	 * Create an instance of {@link StudentDetails }
	 * 
	 */
	public EmployeeDetails createEmployeeDetails() {
		return new EmployeeDetails();
	}

	/**
	 * Create an instance of {@link GetStudentDetailsRequest }
	 * 
	 */
	public EmployeeDetailsRequest createEmployeeDetailsRequest() {
		return new EmployeeDetailsRequest();
	}

}
