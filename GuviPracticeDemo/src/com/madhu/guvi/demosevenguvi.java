package com.madhu.guvi;

import java.util.Scanner;

public class demosevenguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		String[][] userInputArray = new String[3][3];
		
		for(int i = 0; i<2;i++)
		{
			if(obj.hasNextLine()!=false)
			{
				for(int j = 0;j<3;j++)
				{
					if(obj.hasNext()==false)
					{
						break;
					}
					if(obj.hasNext()!=false)
					{
						userInputArray[i][j] = obj.next();
					}
					
				}
				
			}
			
		}
		
		for(int x = 0;x<3;x++)
		{
			String output = "";
			for(int y = 0;y<3;y++)
			{
				
				output = output+ " " + userInputArray[x][y];
				
			}
			System.out.print(output.trim());
			System.out.println();
		}

	}

}
