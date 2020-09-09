package com.training.employeespringsoap.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "companyId" })
@XmlRootElement(name = "CompanyDetailsRequest")
public class CompanyDetailsRequest {

	protected int companyId;

	public int getcompanyId() {
		return companyId;
	}

	public void setcompanyId(int empId) {
		this.companyId = empId;
	}

}
