package com.cg.ibsproject.service;

public interface BankService {
	public boolean isValidHomeLoanAmount(double loanAmount);

	public boolean isValidEducationLoanAmount(double loanAmount);

	public double sendInterestHomeLoan();

	public double sendInterestEducationLoan();

	public double sendEMI(double loanAmount, int tenure);

	public boolean isValidTenure(int tenure);
}
