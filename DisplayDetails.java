package com.cg.ibs.ui;

import java.util.Scanner;

import com.cg.ibs.service.BankService;
import com.cg.ibs.service.BankServiceImpl;

public class DisplayDetails {
	public static Scanner read;
	public BankService bankService = new BankServiceImpl();

	void init() {
		LoanType choice = null;
		while (choice != LoanType.EXIT) {
			System.out.println("Menu");
			System.out.println("__________________________________");
			System.out.println("Select one of the options below:");
			System.out.println("__________________________________");
			for (LoanType menu : LoanType.values()) {
				System.out.println(menu.ordinal() + "\t" + menu);
			}
			int input = read.nextInt();
			if (input >= 0 && input < LoanType.values().length) {
				choice = LoanType.values()[input];
				switch (choice) {
				case HOME_LOAN:
					displayHomeLoan();
					break;
				case EDUCATION_LOAN:
					displayEducationLoan();
					break;
				case PERSONAL_LOAN:
					displayPersonalLoan();
					break;
				case VEHICLE_LOAN:
					displayVehicleLoan();
					break;
				case EXIT:
					System.out.println("Thank You!");
					break;
				}
			} else {
				System.out.println("Invalid Option!");
			}

		}
	}

	private void displayVehicleLoan() {

	}

	private void displayPersonalLoan() {
		// TODO Auto-generated method stub

	}

	private void displayEducationLoan() {
		// TODO Auto-generated method stub

	}

	private void displayHomeLoan() {
		System.out.println("Welcome to IBS Bank loan scheme!");
		System.out.println("Please enter the required amount of loan.");
		double loanAmount = read.nextDouble();
		boolean resultAmount = bankService.isValidLoanAmount(loanAmount);

		if (resultAmount) {
			System.out.println("The rate of interest for home loan is 8.85 %.");
			System.out.println("Please enter the tenure(in months) you would like to have loan.");
			int tenure = read.nextInt();
			boolean resultTenure = bankService.isValidTenure(tenure);
			if (resultTenure) {
				System.out.println("yes");

			} else {
				System.out.println("no");

			}
		} else {
			System.out.println("Please enter a valid loan amount.");
		}
	}

	public static void main(String[] args) {
		read = new Scanner(System.in);
		DisplayDetails display = new DisplayDetails();
		display.init();
		read.close();
	}

}
