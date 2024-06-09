package com.java.seleniumexplicitwaitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemosecond {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tickets.paytm.com/trains/");
		//driver.get("https://tickets.paytm.com/v1/api/login/travel?isIframe=true&theme=paytm-web");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='yXYSb']")).click();
		Thread.sleep(3000);
		WebElement element= driver.findElement(By.tagName("iframe[0]"));
		Thread.sleep(3000);
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		WebElement elementTwo = driver.findElement(By.id("email_mobile_login"));
		Thread.sleep(3000);
		elementTwo.sendKeys("9952807741");
		driver.quit();
		
	}

}
