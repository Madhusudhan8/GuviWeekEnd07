package com.madhu.guvi;

import java.util.Scanner;

public class DemoHundredAndOne {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		for(int x=1;x<N+1;x++ )
		{
			if(x%2==0)
			{
				System.out.println(x);
			}
		}

	}

}
