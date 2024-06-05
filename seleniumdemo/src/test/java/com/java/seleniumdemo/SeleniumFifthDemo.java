package com.java.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFifthDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@id='searchInput']"));
		Thread.sleep(3000);
		element.sendKeys("Artificial Intelligence");
		Thread.sleep(5000);
		WebElement elementOne=driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		elementOne.click();
		Thread.sleep(5000);
		WebElement elementTwo=driver.findElement(By.xpath("//a[@href='#History']//div[@class='vector-toc-text']//span[contains(text(),'History')]"));
		Thread.sleep(5000);
		elementTwo.click();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals("Artificial intelligence - Wikipedia"))
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

}
