package com.mypackage;

public class Triangle {
	
	public double base;
	public double height;
	
	Triangle(double base,double height)
	{
		this.base = base;
		this.height = height;
	}
	public double calculateArea()
	{
		double area = 0.0;
		area = 0.5 * base * height;
		System.out.println("The area of square is " + area);
		return area;
	}

}
