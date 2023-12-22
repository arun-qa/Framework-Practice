package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLeadPage {
	

	@Test
	public void editleadpage()
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		WebElement updatecompanyname = driver.findElement(By.id("updateLeadForm_companyName"));
		
		updatecompanyname.clear();
		
		updatecompanyname.sendKeys("Google");	
		
		driver.findElement(By.name("submitButton")).click();

		
		
		
		
	}

}
