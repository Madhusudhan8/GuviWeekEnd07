package com.java.seleniumexplicitwaitdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement elementOne=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		elementOne.sendKeys("Admin");
		WebElement elementTwo=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		elementTwo.sendKeys("admin123");
		WebElement elementThree=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		elementThree.click();
		Thread.sleep(6000);
		driver.close();
		
	}

}
