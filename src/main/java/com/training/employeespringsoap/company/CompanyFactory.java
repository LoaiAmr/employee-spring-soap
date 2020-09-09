package com.training.employeespringsoap.company;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class CompanyFactory {

	/**
	 * Create a new EmployeeFactory that can be used to create new instances of
	 * schema derived classes for package: com.training.employeespringsoap.config
	 * 
	 */
	public CompanyFactory() {
		super();
	}

	/**
	 * Create an instance of {@link CompanyDetailsResponse }
	 * 
	 */
	public CompanyDetailsResponse createCompanyDetailsResponse() {
		return new CompanyDetailsResponse();
	}

	/**
	 * Create an instance of {@link CompanyDetails }
	 * 
	 */
	public CompanyDetails createCompanyDetails() {
		return new CompanyDetails();
	}

	/**
	 * Create an instance of {@link CompanyDetailsRequest }
	 * 
	 */
	public CompanyDetailsRequest createCompanyDetailsRequest() {
		return new CompanyDetailsRequest();
	}

}
