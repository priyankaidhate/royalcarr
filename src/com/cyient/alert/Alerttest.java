package com.cyient.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			driver.get("http://www.echoecho.com/javascript4.htm");
			Thread.sleep(5000);
			driver.findElement(By.name("B1")).click();
			Thread.sleep(5000);
			
			String alerttext=driver.switchTo().alert().getText();
			
			System.out.println("alerttext");
			driver.switchTo().alert().accept();
			
			
}
}