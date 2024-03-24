package com.madhu.guvi;

import java.util.Scanner;

public class demofifteenguvi {
	static int fact = 1;

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int N = obj.nextInt();
		try 
		{
			int factorial = factorialFun(N);
			System.out.println(factorial);
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static int factorialFun(int x)
	{
		if(x>0)
		{
			fact = x * factorialFun(--x);
			return fact;
		}
		if(x == 0)
		{
		    return fact ;
		}
		return fact;
	}

}
