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
			driver.get("https://www.demoblaze.com");
			driver.manage().window().maximize();
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			if(actualTitle.equals("STORE"))
			{
				System.out.println("Page landed on correct Website");
				Thread.sleep(4000);
			}
			else
			{
				System.out.println("Page not landed on correct Website");
				Thread.sleep(4000);
			}
			driver.close();
			
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		

	}

}
