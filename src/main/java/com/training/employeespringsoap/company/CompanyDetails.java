package com.training.employeespringsoap.company;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.training.employeespringsoap.employee.EmployeeDetails;
import com.training.employeespringsoap.model.Employee;

/**
 * 
 * @XmlAccesorType It used to determining how to marshal a file to/from XML.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDetails", propOrder = { "companyId", "companyName", "ownerName", "employee" })
public class CompanyDetails {

	protected int companyId;

	@XmlElement(required = true)
	protected String companyName;

	@XmlElement(required = true)
	protected String ownerName;

	@XmlElement(required = true)
	protected List<EmployeeDetails> employee;

	public CompanyDetails() {
		super();
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public List<EmployeeDetails> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeDetails> employee) {
		this.employee = employee;
	}

}
