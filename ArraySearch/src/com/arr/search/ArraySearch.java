package com.arr.search;

public class ArraySearch {
	
	public void ArrSearch(int l,int ar[],int search_ele)
	{
		for(int c = 0; c<l; c++)
		{
			int my_ele = ar[c];
			if(my_ele == search_ele)
			{
				System.out.println(c);
			}
		}
	}

}
