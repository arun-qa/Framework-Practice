package com.leaftaps.design;

import org.openqa.selenium.WebElement;

public interface Element {
	
	public void click(WebElement ele);

	public void clear(WebElement ele);

	public void selectDropDownUsingText(WebElement ele, String value) ;
	
	public String getElementText(WebElement ele);	



}
