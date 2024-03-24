package com.program;

import java.util.Scanner;

public class VowelConsonantCounterDemo {

	public static void main(String[] args) {
		
		int const_count = 0;
		int vow_count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		for(char x : arr)
		{
			if(x == 'a' || x == 'e' || x == 'i' ||x == 'o' || x == 'u' )
			{
				vow_count++;
			}
			else
			{
				const_count++;
			}
		}
		
		System.out.println("Number of constants" + const_count);
		System.out.println("Number of vowels" + vow_count);

	}

}
