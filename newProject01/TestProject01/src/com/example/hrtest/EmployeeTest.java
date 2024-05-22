package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Enter the ID");
		int id = scan.nextInt();
		employee.setId(id);
		System.out.println("Enter the name");
		String name = scan.next();
		employee.setName(name);
		System.out.println("Enter the salary");
		double salary=scan.nextDouble();
		employee.setSalary(salary);
		
		employee.printName();
		employee.printSalary();
		
		

	}

}
