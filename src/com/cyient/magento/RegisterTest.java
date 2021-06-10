package com.cyient.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver() ;
		
		driver.get("https://account.magento.com/");
		driver.findElement(By.linkText("Create an account")) .click();
		//driver.findElement(By .id("register")) .click();
		driver.findElement(By .id("firstname")) .sendKeys("priyanka");
		driver.findElement(By .id("lastname")) .sendKeys("Idhate");
		driver.findElement(By .id("self_defined_company")) .sendKeys("cyient");
		driver.findElement(By .id("email_address")) .sendKeys("priyanka.idhate.1@gmail.com");
		Select selectCompany =new Select(driver.findElement(By.id("company_type")));
		selectCompany.selectByVisibleText("Tech Partner");
		Select selectRole =new Select(driver.findElement(By.id("individual_role")));
		selectRole.selectByVisibleText("Technical/developer");
		Select selectCountry =new Select(driver.findElement(By.name("country")));
		selectCountry.selectByVisibleText("India");
		driver.findElement(By.id("password")).sendKeys("pass@123");
		driver.findElement(By.id("password-confirmation")).sendKeys("pass@123");
		//driver.findElement(By.xpath("//div[@role='presentation']")).click();
		driver.findElement(By.xpath("//button[@title='Submit']")).click();

		
		
	}

}
