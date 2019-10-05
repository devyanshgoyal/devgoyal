package com.cg.practiceserialization.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.cg.practiceserialization.bean.Employee;

public class User {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter employee no.");
		int empNumber = scanner.nextInt();
		System.out.println("Enter employee name");
		String employeeName = scanner.next();
		System.out.println("Enter basic pay.");
		double basicPay = scanner.nextDouble();
		emp.setEmployeeID(empNumber);
		emp.setEmployeeName(employeeName);
		emp.setBasicPay(basicPay);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./data.dat"));
			out.writeObject(emp);
			out.close();
			System.out.println("Object Saved.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
