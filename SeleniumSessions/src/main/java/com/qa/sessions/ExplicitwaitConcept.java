package com.qa.sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitwaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	WebElement wait=  new  WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Login']"))));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
		
		
		
		
	

}
