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
		//creating the chrome driver object
		WebDriver driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		//Navigating to google search engine
		driver.get("https:\\www.google.co.in");
		//waiting for page to load
		Thread.sleep(3000);
		//Lacting the text area element using relative Xpath
		WebElement element=driver.findElement(By.xpath(("(//textarea[@id='APjFqb'])[1]")));
		Thread.sleep(5000);
		//sending the value for text area in google search engine
		element.sendKeys("selenium browser driver");
		Thread.sleep(5000);
		//clicking on tab key to skip the auto suggestions
		element.sendKeys(Keys.TAB);
		//lacating and clicking on google search element
		WebElement elementOne=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		elementOne.click();
		Thread.sleep(5000);
		//closing the browser
		driver.close();

	}

}
