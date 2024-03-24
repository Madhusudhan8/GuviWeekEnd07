package com.madhu.guvi;

import java.util.Scanner;

public class demoguvitweleve 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		String userInputString = obj.nextLine();
		char[] userInputCharacter = new char[userInputString.length()];
		userInputCharacter = userInputString.toCharArray();
		for(int i = 0;i<userInputCharacter.length;i++)
		{
			if(i==0)
			{
				System.out.print(userInputCharacter[i]);
			}
			if(i>0)
			{
				System.out.print(",");
				System.out.print(userInputCharacter[i]);
			}
		}

	}

}
