package com.madhu.guvi;

import java.util.Scanner;

public class demotwo {

	public static void main(String[] args) {
	
		 String userInput = "";
			for(int i = 1; ;i++)
			{
				Scanner obj = new Scanner(System.in);
				if(obj.next()!=null)
				{
		        userInput = userInput+" "+ obj.next();
				}
				else if(obj.next()==null)
				{
					break;
				}
		    }
		System.out.println(userInput);
		        
	}

}
