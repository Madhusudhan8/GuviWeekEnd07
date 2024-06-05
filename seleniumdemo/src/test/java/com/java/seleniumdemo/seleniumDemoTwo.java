package com.java.seleniumdemo;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemoTwo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.co.in");
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath(("(//textarea[@id='APjFqb'])[1]")));
		Thread.sleep(5000);
		element.sendKeys("selenium browser driver");
		Thread.sleep(5000);
		element.sendKeys(Keys.TAB);
		
		WebElement elementOne=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		elementOne.click();
		Thread.sleep(5000);
		driver.close();

	}

}
