package com.madhu.guvi;

import java.util.Scanner;

public class demosixguvi {

	public static void main(String[] args) 
	{
		String[] userInputArray = new String[3];
		Scanner obj = new Scanner(System.in);
		for(int i = 0; i<3; i++)
		{
			if(obj.hasNextLine())
			{
				userInputArray[i] = obj.nextLine();
			}
		}
		String output = "";
		
		for(int j = 0; j<3 ; j++)
		{
			output =output +  userInputArray[j]+" ";
			
			
		}
		System.out.print(output.trim());

	}

}
