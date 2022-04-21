package com.qa.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("WebPage is displayed");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("JAVA");
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Iphone");
		//most cases:
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Mumbai");
		//dynamic id;
		
		driver.findElement(By.xpath("//input[starts-with(@id,''])")).click();
		driver.findElement(By.xpath("//input[ends-with(@name,'']")).click();
		
		
		//for links:
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
	}

}
