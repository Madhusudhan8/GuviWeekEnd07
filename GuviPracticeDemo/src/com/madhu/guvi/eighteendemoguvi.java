package com.madhu.guvi;

import java.util.Scanner;

public class eighteendemoguvi {

	public static void main(String[] args)
	{for(int c =0 ;c<100;c++ )
	{
		Scanner obj = new Scanner(System.in);
		int month = obj.nextInt();
		int[] arrayOne = {1,3,5,7,8,10,12};
		int[] arrayTwo  = {4,6,9,11};
		int feb = 2;
		if(month>0 && month<13) 
		{
			if(month == feb)
			{
				System.out.println(28);
			}
			
			for(int i = 0 ; i<arrayOne.length; i++)
				{
					if(arrayOne[i] == month)
						{
							System.out.println(31);
						}
					else
						{
							continue;
						}
				}
			for(int j = 0 ; j<arrayTwo.length; j++)
				{
					if(arrayTwo[j] == month)
						{
							System.out.println(30);
						}
					else
					{
						continue;
					}
				}
		}	
		else if(month>12||month<1)
		{
			System.out.println("Error");
		}
	}

	}

}
