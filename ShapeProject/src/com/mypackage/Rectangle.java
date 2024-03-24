package com.mypackage;

public class Rectangle {
	
	public double length;
	public double breadth;
	
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
		
	}
	public double calculateArea()
	{
		double area = 0.0;
		area = length * breadth;
		System.out.println("The area of square is " + area);
		return area;
	}
	

}
