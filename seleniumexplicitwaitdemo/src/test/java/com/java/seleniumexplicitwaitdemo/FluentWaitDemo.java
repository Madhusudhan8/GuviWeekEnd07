package com.java.seleniumexplicitwaitdemo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(5L))
			       .ignoring(NoSuchElementException.class);

			   WebElement elementOne = wait.until(new Function<WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			     }
			     });
			   elementOne.sendKeys("Admin");
			   WebElement elementTwo = wait.until(new Function<WebElement>() {
				     public WebElement apply(WebDriver driver) {
				       return driver.findElement(By.xpath("//input[@placeholder='Password']"));
				     }
				     });
			   elementTwo.sendKeys("admin123");
			   
			   WebElement elementThree = wait.until(new Function<WebElement>() {
				     public WebElement apply(WebDriver driver) {
				       return driver.findElement(By.xpath("//button[normalize-space()='Login']"));
				     }
				     });
			   
			   elementThree.click();
			   
			   
			   
			       
			       
			       

	}

}
