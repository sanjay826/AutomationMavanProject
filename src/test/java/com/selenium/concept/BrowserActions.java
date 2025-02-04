package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	public static void main(String[] args) {
		
	 // Basic locators 
	 // 1) ID : id attribute values of element
	 // 2) name : name attribute value of element
	 // 3) className : class attribute value of element 
	 // 4) tagName : html tag value of element 
	 // 5) linktext : will wok only for hyper-links = text value of hyperlink
	 // 6) partiallinktext : will work only for hyper-link- partial text value of hyperlink

     // locator ==> by.id("") ==> data type 'By' 
	 // WebElement ==> driver.findElement(By.id("")); ==> data type 'WebElement'
		
//  we can check it whatever locator choose whether it is correct or not basic locators you can check 
		//it by find inside square bracket []
//      1. Launch the browser 
		WebDriver driver = new ChromeDriver();

//       2. Minimize the browser window 
		driver.manage().window().maximize();
		
//       3. Delete all browser cookies 
		driver.manage().deleteAllCookies();
		
//      4. Enter the URL and launch the application (https://www.google.co.in/) 
		driver.get("https://www.google.co.in/");
		
//      5. locate the WebElement google search text box using 'id'locator 
		
		driver.findElement(By.id("APJFqb"));
		
//      6. locate the WebElement google search text box using 'name'locator 
			
		driver.findElement(By.id("APJFqb"));

//     7. locate the WebElement google search text box using 'className'locator 
	   driver.findElement(By.className("gLFyf"));
	   
//     8. locate the WebElement google search text box using 'tagName'locator
	   
	   driver.findElement(By.tagName("textarea"));
	   
//     9. locate the WebElement google search text box using 'tagName'locator [you can check it by // in find section]	   
		
	   driver.findElement(By.tagName("textarea"));

//     10. locate the WebElement 'how Search Works' hyperlink  using 'linktext'locator
	   
	   driver.findElement(By.linkText("how Search Works"));
	   
//    11. locate the WebElement 'how Search Works' hyperlink  using 'Partiallinktext'locator
	   
	   driver.findElement(By.linkText("how Search"));
	   
	   
	
	}

}
