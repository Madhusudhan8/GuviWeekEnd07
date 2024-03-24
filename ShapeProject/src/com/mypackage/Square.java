package com.mypackage;

public class Square extends Shape {
	
	public double length;
	
	Square(double length)
	{
		
		this.length = length;
	}
	
	public double calculateArea()
	{
		double area = 0.0;
		area = length * length;
		System.out.println("The area of square is " + area);
		return area;
	}
}
