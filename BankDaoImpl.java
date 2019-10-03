package com.cg.ibsproject.dao;

public class BankDaoImpl implements BankDao {

	public double sendInterestHomeLoan() {
		double rateOfInterest = 8.85;
		return rateOfInterest;
	}

	public double sendInterestEducationLoan() {
		double rateOfInterest = 10.35;
		return rateOfInterest;
	}
}
