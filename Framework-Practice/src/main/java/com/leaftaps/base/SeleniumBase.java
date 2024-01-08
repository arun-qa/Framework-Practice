package com.leaftaps.base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.design.Browser;
import com.leaftaps.design.Element;

public class SeleniumBase implements Browser, Element  {



	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		
		
		
	}

	public void clear(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}

	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public RemoteWebDriver startApp(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement locateElement(String locatorType, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement locateElement(String value) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> locateElements(String type, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	public void switchToAlert() {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void typeAlert(String data) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(String title) {
		// TODO Auto-generated method stub
		
	}

	public void defaultContent() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

}
