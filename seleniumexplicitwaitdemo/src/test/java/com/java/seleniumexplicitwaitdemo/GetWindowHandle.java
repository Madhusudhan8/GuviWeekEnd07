package com.java.seleniumexplicitwaitdemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		WebElement elementOne= driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		elementOne.click();
		System.out.println("Window handle before switching");
		System.out.println(driver.getTitle());
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windowHandlesList= new ArrayList<String>(windowHandles);
		String firstHandle= windowHandlesList.get(1);
		driver.switchTo().window(firstHandle);
		System.out.println("Window handle after switching");
		System.out.println(driver.getTitle());
		
		


	}

}
