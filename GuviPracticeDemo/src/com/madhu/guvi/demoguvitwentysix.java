package com.madhu.guvi;

import java.util.Scanner;

public class demoguvitwentysix {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		float rad = obj.nextFloat();
		if(rad>0)
		{
		float circum = (float) (2 *(Math.PI)* rad);
		System.out.format("%.2f",circum);
		}
		else if(rad<0)
		{
			System.out.println("Error");
		}
	}

}
