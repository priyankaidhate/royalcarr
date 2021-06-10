package com.cyient.multipletab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseCloseTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(" https://www.online.citibank.co.in/");
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		Thread.sleep(5000);
		
		String actualTitle = driver.getTitle(); 
		System.out.println("actualTitle");
		driver.close();//close the current tab
		driver.quit();//close all tab
	}

}
