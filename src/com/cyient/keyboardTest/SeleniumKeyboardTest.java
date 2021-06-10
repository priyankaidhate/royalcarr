package com.cyient.keyboardTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumKeyboardTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.name("q")))
		//.click().pause(1000).keyDown(Keys.SHIFT).sendKeys("google").keyUp(Keys.SHIFT).pause(1000)
		//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).pause(1000)
		//.sendKeys(Keys.ENTER).build().perform();
		
		action.moveToElement(driver.findElement(By.name("q")))
		.click().pause(1000).keyDown(Keys.SHIFT).sendKeys("google").keyUp(Keys.SHIFT).build().perform();
		int a=1;
		while(a<=5)
		{
			action.pause(1000).sendKeys(Keys.ARROW_DOWN).build().perform();	
		     a++;
		     
		}
		action.pause(1000).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		}

}
