package com.cg.ibs.service;

public interface BankService {
	public boolean isValidLoanAmount(double loanAmount);

	public boolean isValidTenure(int tenure);
}
