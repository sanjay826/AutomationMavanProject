package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatioCRM_LoginPage {

	public static void main(String[] args) throws InterruptedException {

//      1. Launch the browser 
		WebDriver driver = new ChromeDriver();

//       2. Minimize the browser window 
		driver.manage().window().maximize();

//       3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//      4. Enter the URL and launch the application (https://accounts.creatio.com/login/alm?) 
		driver.get("https://accounts.creatio.com/login/alm?");

//      5. Allow all cookies by clicking button 
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();

//      6. Enter the Email id 

		driver.findElement(By.xpath("//input[@aria-label='Business email']")).sendKeys("sonardih420@outloo.com");

//      7. Enter the password 
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Sonardih@123");

//      8. Click on login Button 
		driver.findElement(By.xpath("//span[text()=' LOG IN ']")).click();

	}

}
