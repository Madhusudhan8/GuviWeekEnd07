package com.madhu.guvi;

import java.util.Scanner;

public class demoseventeenguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		float userInputNumber = Math.round(obj.nextFloat());
		if(userInputNumber>0)
		{
			int remainder =(int) (userInputNumber%2);
			
				if(remainder == 0)
					{
						System.out.println("Even");
					}
				else if(remainder == 1)
					{
						System.out.println("Odd");
					}
		}	
		else if(userInputNumber == 0)
		{
			System.out.println("Zero");
		}
		
	}

}
