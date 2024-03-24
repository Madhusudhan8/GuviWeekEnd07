package com.madhu.guvi;

import java.util.Scanner;

public class demoelevenguvi {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		float[] userInputFloat = new float[3]; 
		for(int i = 0;i<3;i++)
		{
			userInputFloat[i] = obj.nextFloat();
		}
		for(int x = 0;x < 3;x++)
		{
			System.out.println(userInputFloat[x]);
		}
		
		
	}

}
