package com.java.exception2;

public class ExceptionHandlingDemo02 {

	public static void main(String[] args) 
	{
		String s1 = new String("Raman");
		
		try
		{
			System.out.println(s1.charAt(6));   
		}
		catch(StringIndexOutOfBoundsException sbe)
		{
			sbe.printStackTrace();
			System.out.println("Exception won't happen now");
			System.out.println(s1.charAt(2));
		}

	}

}
