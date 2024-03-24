package com.madhu.guvi;

import java.util.Scanner;

public class demotwentyguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int result = 1;
		for(int i = 1;i<4;i++)
		{
			result = result * x;
		}
		System.out.println(result);

	}

}
