package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatioCRM_SignUpPage {

	public static void main(String[] args) throws InterruptedException {
		
//		  1. Launch the browser 
		  WebDriver driver = new ChromeDriver();

//	      2. Maximize the browser window 
		  driver.manage().window().maximize();

//	      3. Delete all browser cookies 
		  driver.manage().deleteAllCookies();

//	      4. Enter the URL and launch the application (https://accounts.creatio.com/login/alm?) 
		  driver.get("https://accounts.creatio.com/login/alm?");
		  
//		  5. Allow all cookies by clicking button 
		   driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
		  
//        6. Click on SignUp button 
		  driver.findElement(By.xpath(" //span[text()=' SIGN UP ']")).click();
		  
		  Thread.sleep(5000);
//        7. Enter the User ID 
		  driver.findElement(By.xpath("//input[@aria-label='Business email']")).sendKeys("sonardih420@outlook.com");
		  
		  Thread.sleep(5000);
//        8. Enter the password 
		  driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Sonardih@123");
		  
//        9. Click on continue button 
		  driver.findElement(By.xpath("//span[text()=' CONTINUE ']")).click();
		  
		  Thread.sleep(5000);
		  
//        9. Enter the First Name 
		  driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Sanjay");
		  
//        10. Enter the last name 
		  driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Kumar");
		  
//        11. Enter the Company Name 
		  driver.findElement(By.xpath("//input[@aria-label='Company']")).sendKeys("Sky_test.com");
		  
//        12. Enter the Website 
		  driver.findElement(By.xpath("//input[@aria-label='Website']")).sendKeys("Sky_test");

//        13. Enter the Country name 
		  driver.findElement(By.xpath("//input[@aria-label='Country']")).sendKeys("India");
		  
//		  14. Click on dropdown for Country selection 
		  driver.findElement(By.xpath("//div[@role='combobox']")).click();
		  
//        15. Select the Country 
		  driver.findElement(By.xpath("//span[text()='India (भारत)']")).sendKeys("9798762310");
		  
//        16. Click on SIGN UP BUTTON
		  driver.findElement(By.xpath("//span[text()=' SIGN UP ']")).click();
	}

}
