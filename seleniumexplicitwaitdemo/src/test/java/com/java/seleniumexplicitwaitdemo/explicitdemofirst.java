package com.java.seleniumexplicitwaitdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class explicitdemofirst 
{

	public static void main(String[] args) 
	{
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.co.in");
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFqb")));


	}

}
