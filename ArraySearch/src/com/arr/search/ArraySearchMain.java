package com.arr.search;
import java.lang.String;
import java.util.Scanner;


public class ArraySearchMain 
{
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the length of the array");
		Scanner inx = new Scanner(System.in);
		int len = inx.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the elements of the array");
		for(int i = 0 ; i < len; i++)
		{
		    arr[i] = inx.nextInt();
		}
		System.out.println("Enter the element to search");
		int search_element = inx.nextInt();
		System.out.println("The index is ");
		ArraySearch ars = new ArraySearch();
		ars.ArrSearch(len, arr, search_element);
		System.out.println("End of the program");
		
	}

}
