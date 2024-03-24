package com.madhu.guvi;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoThirtyOneGuvi {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		if(num>999999 && num<10000000)
		{
			int unitDigit = num%10;
			int tensDigit = (num%100)/10;
			int hundredsDigit = (num%1000)/100;
			int thousandsDigit = (num%10000)/1000;
			int tenThousandsDigit = (num%100000)/10000;
			int hundredThousandDigit = (num%1000000)/100000;
			int millionthDigit = (num%10000000)/1000000;
			
			System.out.print(millionthDigit+" "+hundredThousandDigit+" "+tenThousandsDigit +" "+thousandsDigit + " " +hundredsDigit + " " + tensDigit +" "+ unitDigit);
		}
		if(num>99999 && num<1000000)
		{
			int unitDigit = num%10;
			int tensDigit = (num%100)/10;
			int hundredsDigit = (num%1000)/100;
			int thousandsDigit = (num%10000)/1000;
			int tenThousandsDigit = (num%100000)/10000;
			int hundredThousandDigit = (num%1000000)/100000;
			
			System.out.print(hundredThousandDigit+" "+tenThousandsDigit +" "+thousandsDigit + " " +hundredsDigit + " " + tensDigit +" "+ unitDigit);
		}
		if(num>9999 && num<100000)
		{
			int unitDigit = num%10;
			int tensDigit = (num%100)/10;
			int hundredsDigit = (num%1000)/100;
			int thousandsDigit = (num%10000)/1000;
			int tenThousandsDigit = (num%100000)/10000;
			
			System.out.print(tenThousandsDigit +" "+thousandsDigit + " " +hundredsDigit + " " + tensDigit +" "+ unitDigit);
		}
		if(num>999 && num<10000)
		{
			int unitDigit = num%10;
			int tensDigit = (num%100)/10;
			int hundredsDigit = (num%1000)/100;
			int thousandsDigit = (num%10000)/1000;
			
			System.out.print(thousandsDigit + " " +hundredsDigit + " " + tensDigit +" "+ unitDigit);
		}
		
		if(num>99 && num<1000)
		{
			int unitDigit = num%10;
			int tensDigit = (num%100)/10;
			int hundredsDigit = (num%1000)/100;
			
			System.out.print(hundredsDigit + " " + tensDigit +" "+ unitDigit);
		}
		if(num>9 && num<100)
		{
			int unitDigit = num%10;
			int tensDigit = (num%100)/10;
			
			System.out.print(tensDigit +" "+ unitDigit);
		}
		if(num>0 && num<10)
		{
			int unitDigit = num%10;
			
			System.out.print(unitDigit);
		}


	}

}
