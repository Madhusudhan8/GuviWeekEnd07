package com.madhu.guvi;

import java.util.Scanner;

public class demosixteenguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int[] num = new int[3]; 
		int greatest = 0;
		for(int i = 0; i<3;i++)
		{
			num[i] = obj.nextInt();
		}
		if(num[0]>num[1])
		{
			greatest = num[0];
		}
		else if(num[1]>num[0])
		{
			greatest = num[1];
		}
		if(greatest>num[2])
		{
			System.out.println(greatest);
		}
		else if(num[2]>greatest)
		{
			System.out.println(num[2]);
		}

	}

}
