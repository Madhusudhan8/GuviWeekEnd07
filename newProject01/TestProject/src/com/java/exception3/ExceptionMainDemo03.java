package com.java.exception3;

import java.util.Scanner;

public class ExceptionMainDemo03 {

	public static void main(String[] args) 
	{
		Voter vo = new Voter();
		System.out.println("Enter the age for candidate");
		Scanner scan = new Scanner(System.in);
		int age=scan.nextInt();
		try 
		{
			vo.eligibleToVote(age);
		} 
		catch (InvalidAgeException e) 
		{
			
			e.printStackTrace();
		}

	}

}
