package com.java.ia;

public class Account 
{
	public int ID;
	public double balance;
	double newBalance;
	public Account()
	{
		this.ID = 01;
		this.balance = 5000;
	}
	public Account(int iD, double balance)
	{
		super();
		ID = iD;
		this.balance = balance;
	}
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	public double getBalance() 
	{
		return this.balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public double depositMoney(double depositMoney)
	{
		
		this.newBalance=this.balance+depositMoney;
		System.out.println(newBalance);
		return newBalance;
	}
	public double withdrawMoney(double withdrawalMoney)
	{
		this.newBalance=this.balance - withdrawalMoney;
		System.out.println(newBalance);
		return newBalance;
		
	}

}
