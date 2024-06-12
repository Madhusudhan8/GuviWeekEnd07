package com.java.seleniumexplicitwaitdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethodsDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(6000);
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.close();

	}

}
