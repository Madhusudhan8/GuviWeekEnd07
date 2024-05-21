package com.java.xceptionhandling;

public class Animal 
{
	public String nameOne = "Dog";
	protected String action = "Barking";
	int legs = 4;
	private String food = "Vegeterian";
	
	public void act()
	{
		System.out.println("Private Member"+ " "+ this.food);
	}
	
}


