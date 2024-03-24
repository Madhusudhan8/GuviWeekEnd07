package io.demo;

public class DynamicArrayDemo {

	public static void main(String[] args)
	{
		int arr[] = new int[3];
		arr[0]=9;
		arr[1] = 10;
		arr[2] = 11;
		for(int ele: arr)
		{
			System.out.println(ele);
		}
		arr = new int[10];
		for(int ele: arr)
		{
			System.out.println(ele);
		}
		

	}

}
