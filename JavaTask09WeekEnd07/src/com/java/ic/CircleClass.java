package com.java.ic;

import java.util.Scanner;

public class CircleClass {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		double Pi=Math.PI;
		Circle circle = new Circle();
		circle.setRadius(radius);
		circle.getRadius();
		circle.calculateCircumferance(radius, Pi);
		
		Circle circle2= new Circle(radius, Pi);
		circle2.calculateCircumferance(radius, Pi);
		

	}

}
