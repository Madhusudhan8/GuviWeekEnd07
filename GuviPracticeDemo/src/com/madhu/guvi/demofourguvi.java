package com.madhu.guvi;

import java.util.Scanner;

public class demofourguvi {

	public static void main(String[] args)
	{
		
		String[][] userInput =(String[][]) new String[50][50];
		Scanner obj = new Scanner(System.in);
		for(int i = 0; i<3;i++)
		{
			if(obj.hasNext())
			{
				for(int j = 0; j< 2;j++)
				{
				
					
					userInput[i][j] = obj.next();
				}
			}
			
			
		}
		
		for(int x = 0; x<3; x++)
		{
			System.out.println();
			for(int y = 0; y<2;y++)
			{
				System.out.print(userInput[x][y]+" ");
			}
		}
		
		
		
		
		
		
		
//        

	}

}
