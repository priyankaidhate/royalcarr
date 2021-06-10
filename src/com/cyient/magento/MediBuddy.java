package com.cyient.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MediBuddy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.medibuddy.in/");
		driver.findElement(By.linkText("Signup")).click();
		//Thread.sleep(10000);
		driver.findElement(By .name("firstName")).sendKeys("priyanka");
		driver.findElement(By .name("phone")).sendKeys("8446739678");
		driver.findElement(By .name("username")).sendKeys("priyanka.idhate.1@gmail.com");
		driver.findElement(By .name("password")).sendKeys("pass");
		
		
		driver.findElement(By.xpath("//input[@type='checkbox']"));
		driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
		driver.findElement(By .xpath("//span[text()='Female']")).click();
		
	}

}
