package com.chaining;

public class Employee1 {
	int id;
	String name;
	String Qualification;
	String city;
	public Employee1()
	{
		System.out.println("Local Chaining");
		System.out.println("Default constructor");
	}
	public Employee1(int id, String name)
	{
		this();
		System.out.println("Inside second constructor");
		this.id = id;
		this.name = name;
	}
	public Employee1(int id, String name, String Qualification)
	{
		this(id,name);
		System.out.println("Inside third constructor");
		this.Qualification = Qualification;
		
	}
	public Employee1(int id, String name, String Qualification, String city)
	{
		this(id,name,Qualification);
		System.out.println("Inside fourth constructor");
		this.city = city;
	}
	
	public void display()
	{
		System.out.println("Details of Employee");
		System.out.println("Name:" + this.name + " ID:"
		+ this.id + " Qualification:" + this.Qualification + 
		" City" + this.city);
		
		
	}

}
