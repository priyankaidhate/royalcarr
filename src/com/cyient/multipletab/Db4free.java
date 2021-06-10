package com.cyient.multipletab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Db4free {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.get("https://www.db4free.net/");
         driver.findElement(By.linkText("phpMyAdmin »")).click();
         Set<String> s= driver.getWindowHandles();
         for(String st:s )
         {
                 System.out.println(st);
                 System.out.println(driver.getTitle());
                 driver.switchTo().window(st);
                 
         }
         
         driver.findElement(By.id("input_username")).sendKeys("db123");
         driver.findElement(By.id("input_password")).sendKeys("test123");
         driver.findElement(By.id("input_go")).click();
 
         String actualTest= driver.findElement(By.xpath("(//div[@role='alert'])[3]")).getText();
         System.out.println(actualTest);
         
         driver.close();
         
}
}
