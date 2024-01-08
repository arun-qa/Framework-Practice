package com.leaftaps.design;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface Browser {
	
	public RemoteWebDriver startApp(String url);
	
	public WebElement locateElement(String locatorType, String value);	
	
	public WebElement locateElement(String value);
	
	public List<WebElement> locateElements(String type, String value);	
	
	public void switchToAlert();

	public void acceptAlert();

	public void dismissAlert();

	public String getAlertText();

	public void typeAlert(String data);

	public void switchToWindow(int index);

	public void switchToWindow(String title);

	public void defaultContent();
	
	public void close();

	public void quit();




}
