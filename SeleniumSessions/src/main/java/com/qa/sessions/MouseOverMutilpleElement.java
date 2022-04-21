package com.qa.sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverMutilpleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		System.out.println("WebPage is displayed");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		Actions action  = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//div[contains(text(),'Music')]"))).build().perform();
		System.out.println("Mouse over on music is displayed");
		action.moveToElement((WebElement) By.xpath(".//div[contains(text(),'Rock')]")).build().perform();
		System.out.println("Mouse over on Rock from menu");
		driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]")).click();
		

	}

}
