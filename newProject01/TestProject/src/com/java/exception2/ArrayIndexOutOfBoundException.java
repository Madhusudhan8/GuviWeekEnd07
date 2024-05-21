package com.java.exception2;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args)
	{
		System.out.println("Enter the values for array");
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		try
		{
			arr[11]=scan.nextInt();
		}
		catch(ArrayIndexOutOfBoundException ae)
		{
			System.out.println("It will work here");
			arr[0]= scan.nextInt();
		}
		finally
		{
			System.out.println("This will execute no matter what");
		}
	}

}
