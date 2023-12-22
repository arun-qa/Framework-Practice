package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewLeadPage {
	
	@Test
	public void viewleadpage()
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.findElement(By.linkText("Edit")).click();
		
		
	}

}
