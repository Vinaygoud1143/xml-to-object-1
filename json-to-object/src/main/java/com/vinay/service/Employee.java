package com.vinay.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = {"employeenumber","employeename","employeesalary"})
public class Employee {

	private int employeenumber;
	private String employeename;
	//@JsonIgnore
	private int employeesalary;
	public int getEmployeenumber() {
		return employeenumber;
	}
	public void setEmployeenumber(int employeenumber) {
		this.employeenumber = employeenumber;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	
	
	
	
}
