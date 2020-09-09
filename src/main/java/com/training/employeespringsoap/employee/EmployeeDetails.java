package com.training.employeespringsoap.employee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @XmlAccesorType It used to determining how to marshal a file to/from XML.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeDetails", propOrder = { "empId", "username", "email" })
public class EmployeeDetails {

	protected Long empId;

	@XmlElement(required = true)
	protected String username;

	@XmlElement(required = true)
	protected String email;

	public EmployeeDetails() {
		super();
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
