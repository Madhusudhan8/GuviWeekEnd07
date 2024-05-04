package com.java.im;

import java.util.Scanner;

public class EmployeeMainClass {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		emp1.setFirstName("Rast");
		emp1.setSecondName("Ferr");
		emp1.setID(1);
		emp1.setSalary(50000);
		System.out.println(emp1.getFirstName());
		System.out.println(emp1.getSecondName());
		System.out.println(emp1.getID());
		System.out.println(emp1.getSalary());
		System.out.println("Enter the salary you want to incease");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("Increased salary");
		System.out.println(emp1.raiseSalary(emp1.salary, x));
		

	}

}
