package com.selenium.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusudhan.Venu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://192.168.2.10");
		driver.findElement(By.id("UserName")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div/div[3]/div/input")).click();
		Thread.sleep(2000);
		for(int i=0;i<6;i++)
		{
		driver.findElement(By.linkText("Register Student")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Mahendra Singh");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Dhoni");
		Thread.sleep(2000);
		driver.findElement(By.id("Age")).sendKeys("40");
		Thread.sleep(2000);
		driver.findElement(By.id("RollNumber")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("Class")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.id("DateOfJoining")).sendKeys("10101995");
		Thread.sleep(2000);
		String s1 = driver.findElement(By.xpath("/html/body/div[2]/footer/p")).getText();
		driver.findElement(By.xpath("/html/body/div[2]/form/div/div[7]/div/input")).click();
		System.out.println(s1);
		boolean b1 = (s1.matches("(.*) 2023 - Student Web App 1"));
		System.out.println(b1);
		
		if(b1)
		{
			restartAppserverOne();
		}
		else
		{
			restartAppserverTwo();
		}
		}	

	}
	
	 public static void restartAppserverOne() throws IOException, InterruptedException
	    {
		 ProcessBuilder procBuilder = new ProcessBuilder("C:\\Users\\Madhusudhan.Venu\\eclipse-workspace\\SeleniumDemo\\RestartAppServerOne.bat");
			Process pro = procBuilder.start();
			Thread.sleep(35000);
			BufferedReader br = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			int returnCode = pro.waitFor();
			if(returnCode == 0)
			{
			System.out.println("Restarting App server One");
			}
			else
			{
				Thread.sleep(returnCode);
			}
	    }
	 public static void restartAppserverTwo() throws IOException, InterruptedException
	    {
		 ProcessBuilder procBuilder = new ProcessBuilder("C:\\Users\\Madhusudhan.Venu\\eclipse-workspace\\SeleniumDemo\\RestartAppServerTwo.bat");
			Process pro = procBuilder.start();
			Thread.sleep(35000);
			BufferedReader br = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			int returnCode = pro.waitFor();
			if(returnCode == 0)
			{
			System.out.println("Restarting App server Two");
			}
			else
			{
				Thread.sleep(returnCode);
			}
	    }

}
