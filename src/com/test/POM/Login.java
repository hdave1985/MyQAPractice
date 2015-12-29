package com.test.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{

	private static WebElement element;
	
	public static WebElement txtLogin(WebDriver driver) 
	{
	
		element = driver.findElement(By.id(""));
		return element;
	}
	
	public static WebElement txtpassword(WebDriver driver) 
	{
	
		element = driver.findElement(By.id(""));
		return element;
	}
	
	public static WebElement btnOk(WebDriver driver) 
	{
	
		element = driver.findElement(By.id(""));
		return element;
	}
}
