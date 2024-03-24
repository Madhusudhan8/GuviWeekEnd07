package com.madhu.guvi;

import java.util.Scanner;

public class demotenguvi {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		String userInput = obj.next();
		char[] usrInput = new char[userInput.length()];
		usrInput = userInput.toCharArray();
		String output = "";
		for(int i = 0;i<usrInput.length;i++)
		{
			output = output + usrInput[i]+" ";
			
		}
		System.out.print(output.trim());

	}

}
