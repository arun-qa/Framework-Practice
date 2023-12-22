package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WelcomePage {
	
	@Test
	public void welcomepage()
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
	}

}
