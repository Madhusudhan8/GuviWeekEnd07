import java.util.Scanner;

public class MyClass
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of elements in array");
		Scanner inx = new Scanner(System.in);
		int x = inx.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter the elements of array");
		for(int i = 0 ; i < inx; i++)
		{
		    arr[i] = inx.nextInt();
		}
		
		for (int j=0; j < inx; j++)
		{
		    if (arr[j]>5)
		    {
		        arr[j] = -99;
		    }
		}
		System.out.println("The elements of array after repalcing...");
		
		for(int f = 0 ; f< inx; i++)
		{
		   System.out.println(arr[f]) ;
		}
		
		
	}