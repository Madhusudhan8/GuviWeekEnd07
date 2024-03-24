package com.madhu.guvi;

import java.util.Scanner;

public class demotwentytwoguvi {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		float side = obj.nextFloat();
		float area = (float) ((0.25)*(Math.sqrt(3))*side*side);
		System.out.format("%.2f",area);

	}

}
