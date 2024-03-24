package com.madhu.guvi;

import java.util.Scanner;

public class demothirteenguvi {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int N = obj.nextInt();
		int[] num = new int[3];
		for(int i=0, j = 1 ;i<num.length;i++,j++)
		{
			num[i] = j * N;
			
		}
		String s1 = "";
		for(int x = 0;x<num.length;x++)
		{
			s1 = s1 + num[x] + " ";
		
		}
		System.out.print(s1.trim());

	}

}
