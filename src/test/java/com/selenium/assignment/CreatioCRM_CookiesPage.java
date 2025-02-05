package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatioCRM_CookiesPage {

	public static void main(String[] args) throws InterruptedException {
//      1. Launch the browser 
		WebDriver driver = new ChromeDriver();

//       2. Maximize the browser window 
		driver.manage().window().maximize();

//       3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

//      4. Enter the URL and launch the application (https://accounts.creatio.com/login/alm?) 
		driver.get("https://accounts.creatio.com/login/alm?");

//      5. Click on the 'Show Details' button from the cookies section at the bottom of the page
		driver.findElement(By.xpath("//a[@id='CybotCookiebotDialogBodyEdgeMoreDetailsLink']")).click();

//      6. Click on the 'Consent' button from the cookies detail page 
		driver.findElement(By.xpath("//a[@id='CybotCookiebotDialogNavDeclaration']")).click();

//      7. Click on the 'Preferences' button to turn it ON in the consent page.  

		driver.findElement(By.xpath("//input[@id='CybotCookiebotDialogBodyLevelButtonPreferences']")).click();

//      8. Click on the 'Statistics' button to turn it ON in the consent page.
		driver.findElement(By.xpath("//input[@id='CybotCookiebotDialogBodyLevelButtonStatistics']")).click();

//      9. Click on the 'Marketing' button to turn it ON in the consent page.
		driver.findElement(By.xpath("//input[@id='CybotCookiebotDialogBodyLevelButtonMarketing']")).click();

//      10. Click on the 'Details' button from the cookies detail page 
		driver.findElement(By.xpath("//a[@id='CybotCookiebotDialogNavDetails']")).click();

//      11.  Click on the 'Preferences' button to turn it ON in the Details page
		driver.findElement(By.xpath("//input[@id='CybotCookiebotDialogBodyLevelButtonPreferencesInline']")).click();

//      12. Click on the 'Statistics' button to turn it ON in the Details page.
		driver.findElement(By.xpath("//input[@id='CybotCookiebotDialogBodyLevelButtonStatisticsInline']")).click();

//      13. Click on the 'Marketing' button to turn it ON in the Details page.
		driver.findElement(By.xpath("//input[@id='CybotCookiebotDialogBodyLevelButtonMarketingInline']")).click();

//      14. Click on the 'About' button from cookies detail page 
		driver.findElement(By.xpath("//a[@id='CybotCookiebotDialogNavAbout']")).click();

//      15. Click on the 'Allow selection; button from bottom of cookies page 
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection']"))
				.click();

		System.out.println("All cookies have been selected successfully.");
		driver.close();
	}

}
