package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {

		/* CSS Locators */
		/*
		 * Syntax 1 : tagName#id 
		 * Syntax 2 : tagName.className 
		 * Syntax 3 :tagName[Attribute='attribute'Value']
		 * Syntax 4 : parentCssLocator >childCssLocator (Ex: Ul[class='leftmenu'] > li > a[href=services.htm'])
		 *
		 */
//         1. Launch the browser 
			WebDriver driver = new ChromeDriver();

//	       2. Minimize the browser window 
			driver.manage().window().maximize();
			
//	       3. Delete all browser cookies 
			driver.manage().deleteAllCookies();
			
//	      4. Enter the URL and launch the application (https://www.google.co.in/) 
			driver.get("https://www.google.co.in/");
			
//	      5. locate the WebElement google search text box using 'id'locator 
			
			driver.findElement(By.id("APJFqb"));
			
//	      6. locate the WebElement google search text box using 'name'locator 
				
			driver.findElement(By.id("APJFqb"));

//	     7. locate the WebElement google search text box using 'className'locator 
		   driver.findElement(By.className("gLFyf"));
		   
//	     8. locate the WebElement google search text box using 'tagName'locator
		   
		   driver.findElement(By.tagName("textarea"));
		   
//	     9. locate the WebElement google search text box using 'tagName'locator [you can check it by // in find section]	   
			
		   driver.findElement(By.tagName("textarea"));

//	     10. locate the WebElement 'how Search Works' hyperlink  using 'linktext'locator
		   
		   driver.findElement(By.linkText("how Search Works"));
		   
//	    11. locate the WebElement 'how Search Works' hyperlink  using 'Partiallinktext'locator
		   
		   driver.findElement(By.linkText("how Search"));
		
		
	}

}
