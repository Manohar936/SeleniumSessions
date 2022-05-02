package com.qa.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://smallpdf.com/jpg-to-pdf");
		
		driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 ejRuwW']")).sendKeys("C:\\Users\\sanka\\Downloads\\IMG_20210802_102643");
	}

}
