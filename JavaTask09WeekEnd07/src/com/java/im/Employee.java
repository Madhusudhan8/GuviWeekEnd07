package com.java.im;

public class Employee 
{
	public int ID;
	public String firstName;
	public String secondName;
	public int salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public float raiseSalary(int salary,float per)
	{
		float newSalary = ((salary*per)/100) + salary;
				return newSalary;
	}

}
