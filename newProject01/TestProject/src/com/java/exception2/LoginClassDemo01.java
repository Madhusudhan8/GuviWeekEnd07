package com.java.exception2;

import java.util.Scanner;

public class LoginClassDemo01 {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("Enter the user name");
			Scanner scan = new Scanner(System.in);
			String uName =scan.nextLine();
			System.out.println("Enter the password & password should contain 3 characters");
			String pwd = scan.nextLine();
			char[] un = pwd.toCharArray();
			char[] pwdorg = {'p','w','d'};
			
			for(int i=0;i<pwd.length();i++)
			{
				if(un[i]==pwdorg[i])
				{
					
					
					if(i==pwd.length()-1)
					{
						System.out.println("Correct Password");
					}
					
					continue;
				}
			}
		}
		catch(Exception sbe)
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter correct password");
			String uName =scn.nextLine();
			System.out.println("Enter the password & password should contain 3 characters");
			String pwd = scn.nextLine();
			char[] un = pwd.toCharArray();
			char[] pwdorg = {'p','w','d'};
			
			for(int i=0;i<pwd.length();i++)
			{
				if(un[i]==pwdorg[i])
				{
					
					
					if(i==pwd.length()-1)
					{
						System.out.println("Correct Password");
					}
					
					continue;
				}
			}
		}
		finally
		{
			System.out.println("Program Ends");
		}

	}

}
