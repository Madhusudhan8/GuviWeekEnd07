package com.madhu.guvi;

public class demoguvi 
{
	public double division(double a, double b)
	{
		double c = a / b;
		System.out.println("result of division is " + c);
		return c;
	}
	public int subraction(int a, int b)
	{
		int c = a / b;
		System.out.println("result of subraction is " + c);
		return c;
	}
	public int multiplication(int a, int b)
	{
		int c = a * b;
		System.out.println("result of multiplication is " + c);
		return c;
	}

	public static void main(String[] args) 
	{
		demoguvi dg = new demoguvi();
		dg.division(5, 2);
		dg.subraction(10, 8);
		dg.multiplication(5, 5);

	}

}
