package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOfLocators {

	public static void main(String[] args) {
		
		/* CSS Locators */
		/* Syntax 1 : tagName#id 
		 * Syntax 2 : tagName.className
		 * Syntax 3 : tagName[Attribute='attribute'Value']
		 * Syntax 4 : parentCssLocator > childCssLocator (Ex: Ul[class='leftmenu'] > li > a[href=services.htm']) 
		 *
		 */
		
		/*1. launch browser window (browser=Chrome) */
		WebDriver driver = new ChromeDriver();
		
		/* 2. Maximize the browser window */
		driver.manage().window().maximize();
		
		/* 3. Enter the Application URL */
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		/* 4. Click on Solution link */ 
		driver.findElement(By.cssSelector("li[class='Solutions']"));
		
		/* 5. Click on About US link */
		driver.findElement(By.cssSelector("ul[class='leftmenu']> li > a[href='about.htm']"));
		
		/* 6. Click on Services link */
		driver.findElement(By.cssSelector("ul[class='leftmenu']> li > a[href='services.htm']"));
		
		/* 7. Click on Products */
		driver.findElement(By.cssSelector("ul[class='leftmenu']> li >  a[href='http://www.parasoft.com/jsp/products.jsp']"));
		
		/* click on Locations */
		driver.findElement(By.cssSelector("ul[class='leftmenu']> li >  a[href='http://www.parasoft.com/jsp/pr/contacts.jsp']"));
		
		/* click on Admin Page */ 
		driver.findElement(By.cssSelector("ul[class='leftmenu']> li >  a[href='admin.htm']"));
		
		/* Enter the username */
		driver.findElement(By.cssSelector("input[name='username']"));
		
		/* Enter the password */
		driver.findElement(By.cssSelector("input[name='password']"));
		
		/* Click on the Submit */
		driver.findElement(By.cssSelector("input[value='Log In"));
		
		/* Click on forgot login info */
		driver.findElement(By.linkText("Forgot login info?"));
		
		/* click on Home button link by using cssSelector */
		driver.findElement(By.cssSelector("ul[class='button'] >li[class='home'] > a[href='index.htm']"));
		
		/* Click on about us icon by using cssSelector*/
		driver.findElement(By.cssSelector("ul[class='button'] >li[class='aboutus'] > a[href='about.htm']"));
		
		/* click on contact button icon on top */
		driver.findElement(By.cssSelector("ul[class='button'] >li[class='contact'] > a[href='contact.htm']"));
		
		/* Click on parasoft Demo WebSite link by using CSS selector */
		
		driver.findElement(By.cssSelector("div[id='rightPanel'] > p[xpath='1'] > a[href='http://www.parasoft.com/']"));
		
		// https://accounts.creatio.com/
		
		driver.close();
		
		

	}

}
