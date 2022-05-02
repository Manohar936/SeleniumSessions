package com.qa.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("dec2020secondbatch@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();

	}

}
