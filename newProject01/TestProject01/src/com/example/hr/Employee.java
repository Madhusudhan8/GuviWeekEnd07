package com.example.hr;

import java.util.Comparator;

public class Employee implements Comparator<Object>
{
		private int id;
		private String name;
		private double salary;
		public int getId() 
		{
			return id;
		}
		public void setId(int id) 
		{
			this.id = id;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public void printSalary()
		{
			System.out.println("Salary of the person "+ this.name+" is "+this.salary);
		}
		
		public void printName()
		{
			System.out.println("Name of the person "+ this.name);
		}
		public int compare(Object o1,Object o2)
		{
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			String s1=e1.getName();
			String s2=e2.getName();
			return s2.compareTo(s1);
		}
		
}
