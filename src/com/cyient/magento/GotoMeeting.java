package com.cyient.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GotoMeeting {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gotomeeting.com/en-in");
	
		driver.findElement(By.linkText("Start for Free")).click();
	driver.findElement(By .id("first-name")).sendKeys("priyanka");
	driver.findElement(By.id("last-name")).sendKeys("Idhate");
	driver.findElement(By.id("login__email")).sendKeys("priyanka.idhate.1@gmail.com");
		driver.findElement(By.id("contact-number")).sendKeys("8446739678");
		Select selectJobTitle=new Select(driver.findElement(By.id("JobTitle")));
		selectJobTitle.selectByVisibleText("Help Desk");
		driver.findElement(By.id("login__password")).sendKeys("piyu@123");
		driver.findElement(By.xpath("//input[@value='1-9']"));
	
		
	}

}
