package com.madhu.guvi;

import java.util.Scanner;

public class demotwentyoneguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		float[] num = new float[3];
		float mul = 1.00f;
		for(int i = 0;i<3;i++)
		{
			num[i] = obj.nextFloat();
		}
		for(int x = 0;x<3;x++)
		{
			mul = mul * num[x];
		}
		float si = (float)(mul/100);
		System.out.format("%.2f",si);
	}

}
