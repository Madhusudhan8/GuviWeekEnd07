package com.java.arraylistdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		
		System.out.println("Enter the cities you visited");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter One by One");
		ArrayList<String> cities = new ArrayList<String>();
		while(scan.hasNext())
		{
			String city = scan.next();
			cities.add(city);
			continue;
		}
		System.out.println("List of cities entered "+ cities);
		cities.removeAll(cities);
		System.out.println("After removing the cities from list");
		System.out.println("List of cities entered "+ cities);
		
	}

}
