package com.java.exception3;

public class Voter 
{
	public int age;

	public Voter() 
	{
		
	}
	
	public void eligibleToVote(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else if(age<18)
		{
			throw new InvalidAgeException("Not a valid age");
		}
	}
	
}
