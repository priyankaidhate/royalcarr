package com.cyient.ass7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EMRMultitabs {
	public static void main(String[] args) {
		
		                WebDriver driver= new ChromeDriver();
		                driver.manage().window().maximize();
		                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		                
		                driver.get(" htt p://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		                driver.findElement(By.id("authUser")).sendKeys("admin");
		                driver.findElement(By.id("clearPass")).sendKeys("pass");
		                Select lang= new Select(driver.findElement(By.name("languageChoice")));
		                lang.selectByVisibleText("English (Indian)");
		                driver.findElement(By.xpath("//button[@type='submit']")).click();
		                driver.findElement(By.xpath("//div[text()='Patient/Client']")).click();
		                driver.findElement(By.xpath("//div[text()='New/Search']")).click();
		                driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
		                
		                Select assign= new Select(driver.findElement(By.id("form_title")));
		                assign.selectByVisibleText("Ms.");
		                driver.findElement(By.id("form_fname")).sendKeys("xxxxx");
		                driver.findElement(By.id("form_lname")).sendKeys("yyyy");
		                driver.findElement(By.id("form_DOB")).sendKeys("2021-06-04");
		                Select gender= new Select(driver.findElement(By.id("form_sex")));
		                gender.selectByVisibleText("Female");
		                driver.findElement(By.id("create")).click();
		                //come out of frame 
		                //get into new frame 
		                Actions popup= new Actions(driver);
		                popup.moveToElement(driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']"))).click().perform();
		               //come out of frame

		                driver.switchTo().alert().accept();
		                //print alert msg
		                String alertmsg= driver.switchTo().alert().getText();
		                System.out.println(alertmsg);
		                System.out.println(driver.findElement(By.xpath("(//div[@class='clearfix'])")).getText());        
		                //driver.findElement(By.id("clearPass")).sendKeys("pass");
		        }

		
	}


