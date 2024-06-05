package com.java.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoFirst {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		try 
		{
			Thread.sleep(3000);
			driver.get("https://www.google.co.in");
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			if(actualTitle.equals("Google"))
			{
				System.out.println("Title is matching");
			}
			else
			{
				System.out.println("Title is not matching");
			}
			driver.close();
			
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		

	}

}
