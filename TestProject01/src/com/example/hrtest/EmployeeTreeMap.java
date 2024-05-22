package com.example.hrtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import com.example.hr.Employee;

public class EmployeeTreeMap {

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
		
		Employee employeeOne = new Employee();
		System.out.println("Enter the ID");
		int idOne = scan.nextInt();
		employeeOne.setId(idOne);
		System.out.println("Enter the name");
		String nameOne = scan.next();
		employeeOne.setName(nameOne);
		System.out.println("Enter the salary");
		double salaryOne=scan.nextDouble();
		employeeOne.setSalary(salaryOne);
		
		Employee employeeTwo = new Employee();
		System.out.println("Enter the ID");
		int idTwo = scan.nextInt();
		employeeTwo.setId(idTwo);
		System.out.println("Enter the name");
		String nameTwo = scan.next();
		employeeTwo.setName(nameTwo);
		System.out.println("Enter the salary");
		double Twosalary=scan.nextDouble();
		employeeTwo.setSalary(Twosalary);
		
		TreeMap<Object, Object> treemap=new TreeMap<>();
		treemap.put(employee.getName(),employee.getId());
		treemap.put(employeeOne.getName(),employeeOne.getId());
		treemap.put(employeeTwo.getName(),employeeTwo.getId());
		
		System.out.println("TreeMap before sorting alphabettically");
		System.out.println(treemap);
		System.out.println("TreeMap after sorting alphabettically");
		Collections.synchronizedMap(treemap);
		System.out.println(treemap);

	}

}
