package com.java.ia;

import java.util.Scanner;

public class AccountMainClass {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Account acc = new Account(101, 60000);
		System.out.println("Enter the amount to deposit");
		double deposit = scan.nextDouble();
		acc.depositMoney(deposit);
		System.out.println("Balance after the deposit");
		//System.out.println(acc.getBalance());
		System.out.println("Enter the amount to withdraw");
		double withdraw = scan.nextDouble();
		acc.withdrawMoney(withdraw);
		System.out.println("Balance after the withdrawal");
		//System.out.print(acc.getBalance());
		

	}

}
