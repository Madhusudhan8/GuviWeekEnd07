package com.contructor.chaining;

public class Square extends Shape {
	
	public double side;
	
	Square(double side)
	{
		super();
		System.out.println("Child class constructor - Square");
		this.side = side;
	}
	
	public void calcArea()
	{
		double area = 0.0;
		area = side * side;
		System.out.println("Area of the square" + area);
	}

}
