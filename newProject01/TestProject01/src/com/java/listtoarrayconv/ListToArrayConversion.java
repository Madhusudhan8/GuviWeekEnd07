package com.java.listtoarrayconv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListToArrayConversion {

	public static void main(String[] args) 
	{
		System.out.println("Enter 10 whole numbers");
		Scanner scan = new Scanner(System.in);
		List<Integer> ls = new ArrayList<Integer>();
		while(scan.hasNextInt())
		{
			int num = scan.nextInt();
			ls.add(num);
		}
		System.out.println("Entered list of whole numbers "+ls);
		Object[] arr = ls.toArray();
		for(Object a:arr)
		{
			System.out.println(a);
		}
	}

}
