package com.selenium.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ParaBank_Assignment_23 {

	public static void main(String[] args) {

//      1. Launch the browser 
		WebDriver driver = new ChromeDriver();

//      Wait method 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//       2. Minimize the browser window 
		driver.manage().window().maximize();

//       3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//      4. Enter the URL and launch the application ((https:parabank.parasoft.com/parabank/index.htm)) 
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

//      5. Verify application title (ParaBank | Welcome | Online Banking)
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle, expectedTitle, "Application Title did not match");

//      6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@alt='ParaBank']"));
		Assert.assertTrue(logo.isDisplayed());
		/*
		 * String actualLogoSrc = logo.getAttribute("src");
		 * System.out.println(actualLogoSrc); String expectedLogoSrc =
		 * "https://parabank.parasoft.com/parabank/images/logo.gif";
		 * Assert.assertEquals(actualLogoSrc, expectedLogoSrc,
		 * "ParaBank Logo did not match");
		 */

//      7. Verify application caption (Experience the difference)
		WebElement caption = driver.findElement(By.cssSelector("p[class='caption']"));
		String actualcaption = caption.getText();
		String expected = "Experience the difference";
		Assert.assertEquals(actualcaption, expected, "Parabank Caption did not match");

//     8. Enter Invalid credentials in Username and Password textboxes
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ssn");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234589");
		System.out.println("Enter Invalid credentials successfully ");

//     9. Verify button label (LOG IN) and Click on Login Button
		WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
		String actuallable = loginButton.getAttribute("value");
		System.out.println(actuallable);
		String Expectedlabel = "Log In";
		Assert.assertEquals(actuallable, Expectedlabel, "Button lebel (LOG IN) did not match ");
		loginButton.click();
		System.out.println("clicked on button label (LOG IN) successfully");

//    10. Verify error message is coming
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));
		String getErrortext = errorMessage.getText();
		System.out.println(getErrortext);

//    11. Click on Admin page link
		driver.findElement(By.cssSelector("ul[class='leftmenu']> li >  a[href='admin.htm']")).click();

//    12. Wait for admin page
		WebElement adminelement = driver.findElement(By.xpath("//h1[contains(text(),'Administration')]"));
		wait.until(ExpectedConditions.visibilityOf((adminelement)));
		String actualText = adminelement.getText();
		System.out.println(actualText);
		String Expectedtext = "Administration";
		Assert.assertEquals(actualText, Expectedtext, "Admin page did not load");

//    13. Select Data access mode as ' SOAP'
		driver.findElement(By.id("accessMode1")).click();

//    14. Scroll-down till Loan provider
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loanProviderElement = driver.findElement(By.xpath("//b[text()='Loan Provider:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", loanProviderElement);
		String actualText1 = loanProviderElement.getText();
		System.out.println(actualText1);
		String expectedText = "Loan Provider:";
		Assert.assertEquals(expectedText, actualText1, "Loan provider element is not found");

//    15. Select Loan provider as 'Web Service'
		WebElement loanProviderDropdown = driver.findElement(By.xpath("//option[text()='Web Service'] "));
		String selectedvalue = loanProviderDropdown.getText();
		System.out.println(selectedvalue);

//    16. Click on Submit button
		driver.findElement(By.xpath("//input[@value='Submit'] ")).click();
		WebElement successMessage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Settings saved successfully.']")));
		String actualMessage = successMessage.getText();
		System.out.println(actualMessage);
		String expectedMessage = "Settings saved successfully.";
		Assert.assertEquals(actualMessage, expectedMessage, "Submission message did not match");

//      18. Click on Services Link
		driver.findElement(By.cssSelector("ul[class='leftmenu']> li > a[href='services.htm']")).click();
		
//      19. Wait for Services page
		WebElement serviceElement=driver.findElement(By.xpath("//span[text()='Available Bookstore SOAP services:']"));
		wait.until(ExpectedConditions.visibilityOf((serviceElement)));
		serviceElement.getText();
		String actualMessage1 = serviceElement.getText();
		System.out.println(actualMessage1);
		String expectedMessage1 = "Available Bookstore SOAP services:";
		Assert.assertEquals( actualMessage, expectedMessage, "Service page is not loaded");

		driver.close();

	}

}
