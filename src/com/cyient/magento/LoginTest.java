package com.cyient.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.com/");
		
		driver.findElement(By .linkText("Sign in")) .click();
		
		driver.findElement(By .id("email")) .sendKeys("balaji0017@gmail.com");
		driver.findElement(By .id("pass")) .sendKeys("balaji@12345");
	driver.findElement(By .id("send2")) .click();
	//	System.out.println(driver.getTitle());
		
		
		String actualTitle = driver.getTitle(); 
		System.out.println("actualTitle");
		if(actualTitle.equals("My Account"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		driver.findElement(By .linkText("Log Out")) .click();
	}

}
