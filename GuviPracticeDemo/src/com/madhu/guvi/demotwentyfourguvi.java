package com.madhu.guvi;

import java.util.Scanner;

public class demotwentyfourguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		float A = obj.nextFloat();
		float Farenheit = (float) ((A*1.8)+32);
		System.out.format("%.2f",Farenheit);

	}

}
