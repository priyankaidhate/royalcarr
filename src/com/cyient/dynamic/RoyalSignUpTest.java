package com.cyient.dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignUpTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.royalcaribbean.com/account/create");
	
	driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("prii");
	driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("idhate");
	driver.findElement(By.xpath("//span[text()='Month']")).click();
	driver.findElement(By.xpath("//span[text()=' April ']")).click();
	driver.findElement(By.xpath("//span[text()='Day']")).click();
	driver.findElement(By.xpath("//span[text()=' 1 ']")).click();
	driver.findElement(By.xpath("//input[@data-placeholder='Year']")).click();
	driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2021");
	driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
    driver.findElement(By.xpath("//span[text()=' India ']")).click();
    driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("priyankaidhate@gmail.com");
    driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("pri@123");
    driver.findElement(By.xpath("//span[text()='Select one security question'][1]")).click();
    driver.findElement(By.xpath("//span[contains(text(),' What was the first concert you attended? ')]")).click();
    driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("As234");
    driver.findElement(By.xpath("//input[@type='checkbox']//..")).click();
  
    
	
}
}