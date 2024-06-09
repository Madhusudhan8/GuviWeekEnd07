package com.java.seleniumexplicitwaitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemonestedframes {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(element);
		WebElement elementOne=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(elementOne);
		WebElement elementThree=driver.findElement(By.xpath("//body"));
		String text= elementThree.getAttribute("innerText");
		System.out.println(text);
		//driver.close();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(5000);
		WebElement elementFour=driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(elementFour);
		WebElement elementFive=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(elementFive);
		WebElement elementSix=driver.findElement(By.xpath("//body"));
		String textOne= elementSix.getAttribute("innerText");
		System.out.println(textOne);
		//driver.close();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(5000);
		WebElement elementSeven=driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(elementSeven);
		WebElement elementEight=driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(elementEight);
		WebElement elementNine=driver.findElement(By.xpath("//body"));
		String textTwo= elementNine.getAttribute("innerText");
		System.out.println(textTwo);
		//driver.close();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(5000);
		WebElement elementTen=driver.findElement(By.name("frame-bottom"));
		driver.switchTo().frame(elementTen);
		WebElement elementEleven=driver.findElement(By.xpath("//body"));
		String textThree= elementEleven.getAttribute("innerText");
		System.out.println(textThree);
		//driver.close();
		
		
		
		
		

	}

}
