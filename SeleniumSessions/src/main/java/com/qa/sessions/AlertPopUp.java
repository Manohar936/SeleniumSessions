package com.qa.sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
//		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		Alert al =	driver.switchTo().alert();
		System.out.println(al.getText());
		String text=al.getText();
		if(text.equals("Please enter valid email")) {
			System.out.println("correct username");
		}
		else {
			System.out.println("In correct username");
		}
		al.accept();
	
		
			}

}
