package com.cg.ibs.service;

public class BankServiceImpl implements BankService {
	public boolean isValidLoanAmount(double loanAmount) {
		if (loanAmount >= 0 && loanAmount <= 20000000) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isValidTenure(int tenure) {
		if (tenure >= 0 && (tenure == 6 || tenure == 12 || tenure ==18)) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
