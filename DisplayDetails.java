package com.cg.ibsproject.ui;

import java.util.Scanner;

import com.cg.ibsproject.service.*;

public class DisplayDetails {
	public static Scanner read;
	public BankService bankService = new BankServiceImpl();

	public void init() {
		LoanTypes choice = null;
		while (choice != LoanTypes.EXIT) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (LoanTypes menu : LoanTypes.values()) {
				System.out.println(menu.ordinal() + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = read.nextInt();
			if (ordinal >= 0 && ordinal < LoanTypes.values().length) {
				choice = LoanTypes.values()[ordinal];

				switch (choice) {
				case HOME_LOAN:
					displayLoan();
					displayHomeLoan();
					break;
				case EDUCATION_LOAN:
					displayLoan();
					displayEducationLoan();
					break;
				case PERSONAL_LOAN:
					displayLoan();
					displayPersonalLoan();
					break;
				case VEHICLE_LOAN:
					displayLoan();
					displayVehicleLoan();
					break;
				case EXIT:
					System.out.println("Thank You!");
					break;
				}
			} else {
				System.out.println("Invalid Option!!");
				choice = null;

			}

		}

	}

	private double displayLoan() {
		System.out.println("Welcome to IBS Bank loan scheme!");
		System.out.println("Please enter the required amount of loan.");
		double loanAmount = read.nextDouble();
		return loanAmount;
	}

	private void displayHomeLoan() {
		/*
		 * System.out.println("Welcome to IBS Bank loan scheme!");
		 * System.out.println("Please enter the required amount of loan.");
		 * double loanAmount = read.nextDouble(); boolean resultAmount =
		 * bankService.isValidHomeLoanAmount(loanAmount);
		 */
		DisplayDetails display = new DisplayDetails();
		double validatedLoanAmount = display.displayLoan();
		boolean resultAmount = bankService.isValidHomeLoanAmount(validatedLoanAmount);
		if (resultAmount) {
			System.out.println("Rate of interest for home loan:" + bankService.sendInterestHomeLoan());
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			System.out.println(
					"Following are the options for which you can apply loan: \n 1. 6 Months \n 2. 12 Months \n 3. 18 Months");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				double emiAmount = bankService.sendEMI(validatedLoanAmount, tenure);
				System.out.println("EMI Amount is: INR " + emiAmount);
			} else {
				System.out.println("Sorry! This bank doesn't provide loan for this tenure.");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}

	}

	private void displayEducationLoan() {
		DisplayDetails display = new DisplayDetails();
		double validatedLoanAmount = display.displayLoan();
		boolean resultAmount = bankService.isValidEducationLoanAmount(validatedLoanAmount);
		if (resultAmount) {
			System.out.println("Rate of interest for education loan:" + bankService.sendInterestEducationLoan());
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			System.out.println(
					"Following are the options for which you can apply loan: \n 1. 6 Months \n 2. 12 Months \n 3. 18 Months");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				double emiAmount = bankService.sendEMI(validatedLoanAmount, tenure);
				System.out.println("EMI Amount is: INR " + emiAmount);
			} else {
				System.out.println("Sorry! This bank doesn't provide loan for this tenure.");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}

	}

	private void displayVehicleLoan() {
		// TODO Auto-generated method stub

	}

	private void displayPersonalLoan() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		read = new Scanner(System.in);
		DisplayDetails display = new DisplayDetails();
		display.init();
		read.close();
	}
}
