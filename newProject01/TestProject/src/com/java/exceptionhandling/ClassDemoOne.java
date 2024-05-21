package com.java.exceptionhandling;

import java.util.Scanner;

public class ClassDemoOne {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number for division");
		int x;
		int y;
		int z;
		//Three Variables for creating the exception
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		//getting inputs from user using scanner
		
		try
		{
			z = x/y;
			//causing exception deliberately
			System.out.println("Result of division" + z);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Kindly provide the correct values. Dont enter 0 as divisor");
			x = scan.nextInt();
			y = scan.nextInt();
			z = x/y;
			System.out.println("Result of division" + z);
			//catch the exception here in this block
		}
		finally
		{
			System.out.println("It will execute no matter what");
		}


	}

}
