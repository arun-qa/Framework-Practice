package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyHomePage {
	
	
	@Test
	
	public void myhomepage()
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.findElement(By.linkText("Create Lead")).click();

	}

}
