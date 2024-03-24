package com.madhu.guvi;


import java.util.NoSuchElementException;
import java.util.Scanner;

public class demothreejava {

	public static void main(String[] args) {
	    try
	    {
	
		 String userInput = "";
			for(int i = 1;i < 8;i++)
			{
				Scanner obj = new Scanner(System.in);
		        userInput = userInput+" "+ obj.next();
		    }
			System.out.println(userInput.trim());
	    }
	    catch(NoSuchElementException e)
	    {
	        System.out.println(e.getMessage());
	    }
		        
	}

}

