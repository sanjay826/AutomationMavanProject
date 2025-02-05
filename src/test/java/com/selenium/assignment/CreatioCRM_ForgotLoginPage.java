package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatioCRM_ForgotLoginPage {

	public static void main(String[] args) {
		
		
//		   1. Launch the browser 
		   WebDriver driver = new ChromeDriver();

//	       2. Maximize the browser window 
		   driver.manage().window().maximize();

//	       3. Delete all browser cookies 
		   driver.manage().deleteAllCookies();

//	       4. Enter the URL and launch the application (https://accounts.creatio.com/login/alm?) 
		   driver.get("https://accounts.creatio.com/login/alm?");

//	       5. Allow all cookies by clicking button 
		   driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();

//	       6. Enter the Email id 
		   driver.findElement(By.xpath("//input[@aria-label='Business email']")).sendKeys("sonardih420@outloo.com");
			
//         7. Click on forgot password
		   driver.findElement(By.xpath("//a[text()='Forgot password']")).click();
		  
		   driver.close();	
		  
//        
		

	}

}
