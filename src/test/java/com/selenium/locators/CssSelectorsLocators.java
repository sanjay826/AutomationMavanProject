package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsLocators {

	public static void main(String[] args) {
		

		/* CSS Locators */
		/* Syntax 1 : tagName#id 
		 * Syntax 2 : tagName.className
		 * Syntax 3 : tagName[Attribute='attribute'Value']
		 * Syntax 4 : parentCssLocator > childCssLocator (Ex: Ul[class='leftmenu'] > li > a[href=services.htm']) 
		 *
		 */
		
//      1. Launch the browser 
		WebDriver driver = new ChromeDriver();
		
//      2. Minimize the browser window 
		driver.manage().window().maximize();
		
//      3. Delete all browser cookies 
		driver.manage().deleteAllCookies();
		
//		4. locate the WebElement google search text box using 'cssSelector'locator 
		
		driver.findElement(By.cssSelector("textarea#APJFqb"));
		
//      5. locate the WebElement google search text box using 'cssSelector'locator 
		
		driver.findElement(By.cssSelector("textarea.q"));
		

		

	}

}
