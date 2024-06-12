package com.java.seleniumexplicitwaitdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemoSecond {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement elementOne= mywait.until(ExpectedConditions.visibilityOfElementLocated((By) By.xpath("//input[@placeholder='Username']")));
		elementOne.sendKeys("Admin");
		WebElement elementTwo=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		elementTwo.sendKeys("admin123");
		WebElement elementThree=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		elementThree.click();
		Thread.sleep(10000);
		driver.close();

	}

}
