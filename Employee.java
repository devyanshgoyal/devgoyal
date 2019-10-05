package com.cg.practiceserialization.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	private int employeeID;
	private String employeeName;
	private double basicPay;

	public Employee() {
		super();
	}

	public Employee(int employeeID, String employeeName, double basicPay) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.basicPay = basicPay;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", basicPay=" + basicPay + "]";
	}

}
