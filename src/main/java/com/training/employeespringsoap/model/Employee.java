package com.training.employeespringsoap.model;

public class Employee {

	private int empId;

	private String username;

	private String email;

	public Employee() {
		super();
	}

	public Employee(int empId, String username, String email) {
		super();
		this.empId = empId;
		this.username = username;
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", username=" + username + ", email=" + email + "]";
	}

}
