package com.java.seleniumexplicitwaitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadDotSleeep {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement elementOne=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		elementOne.sendKeys("Admin");
		WebElement elementTwo=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		elementTwo.sendKeys("admin123");
		WebElement elementThree=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		elementThree.click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
