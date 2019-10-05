package com.cg.practiceserialization.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.cg.practiceserialization.bean.Employee;

public class User2 {
	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("./data.dat"));
			try {
				Employee emp = (Employee) in.readObject();
				in.close();
				System.out.println(emp);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
