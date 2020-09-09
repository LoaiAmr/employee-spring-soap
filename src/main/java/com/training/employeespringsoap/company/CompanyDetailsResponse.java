package com.training.employeespringsoap.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "companyDetails" })
@XmlRootElement(name = "CompanyDetailsResponse")
public class CompanyDetailsResponse {

	@XmlElement(name = "CompanyDetails", required = true)
	protected CompanyDetails companyDetails;

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

}
