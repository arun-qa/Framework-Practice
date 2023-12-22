package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLeadPage {
	
	@Test
	public void createleadpage()
	
	{
		
		//test
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindharajan");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Flatirons");
		
		driver.findElement(By.name("submitButton")).click();
		

		
	}


}
