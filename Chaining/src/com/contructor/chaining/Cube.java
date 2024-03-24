package com.contructor.chaining;

public class Cube extends Square {
	
	public double side;
	
	public Cube(double side)
	{
		super(side);
		System.out.println("Child class constructor - Cube");
		this.side = side;
		
	}
	public void calcVolume()
	{
		double volume = 0.0;
		volume = side * side * side;
		System.out.println("Volume of the cube " + volume);
	}

}
