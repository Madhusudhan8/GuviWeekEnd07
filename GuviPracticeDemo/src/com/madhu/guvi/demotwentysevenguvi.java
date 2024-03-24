package com.madhu.guvi;

import java.util.Scanner;

public class demotwentysevenguvi {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		for (int i = 1;i<=x;i++)
		{
			if(i>1)
			{
				System.out.print(" ");
			}
			System.out.print(i*9);
		}
		if(x<1)
		{
			System.out.println("NULL");
		}

	}

}
