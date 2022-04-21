package com.qa.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FiindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("WebPage is displayed");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//get count of links in the page
		//get text of links in the page
		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
		String text = links.get(i).getText();
		System.out.println(text);
			
		}
		

	}

}
