package com.cyient.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OenEMRLogin {
	
		public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
			driver.findElement(By .id("authUser")) .sendKeys("admin");
			driver.findElement(By .id("clearPass")) .sendKeys("pass");
			//dropdown
			Select selectLanguage =new Select(driver.findElement(By.name("languageChoice")));
			selectLanguage.selectByVisibleText("English (Indian)");
			
			driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
			//action cls is used for mouse nd keyboard
		 	Actions action=new Actions(driver);
			//action.moveToElement(driver.findElement(By.xpath("//span[text()=''")))
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
}
	}
