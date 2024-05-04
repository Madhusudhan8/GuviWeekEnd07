package com.java.ic;

public class Circle 
{
	public float radius;
	public static double PI;
	public Circle()
	{
		
	}
	public Circle(float radius,double pI)
	{
		super();
		this.radius = radius;
		PI = pI;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public static double getPI() {
		return PI;
	}
	public static void setPI(double pI) {
		PI = pI;
	}
	public double calculateCircumferance(float radius,double pI)
	{
		double circumferance = 2 * pI * radius;
		System.out.println("Circumferance of the circle " + circumferance );
		return circumferance;
	}
}
