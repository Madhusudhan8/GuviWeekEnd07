package com.madhu.guvi;

import java.util.Scanner;

public class demotwentythreeguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		float A = obj.nextFloat();
		float B = obj.nextFloat();
		float C = obj.nextFloat();
		float root1 = (float) (((-B)+(Math.sqrt((B*B)-(4*A*C))))/(2*A));
		float root2 = (float) (((-B)-(Math.sqrt((B*B)-(4*A*C))))/(2*A));
		System.out.println(root1);
		System.out.println(root2);
	}

}
