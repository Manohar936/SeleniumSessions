package com.qa.sessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
action.clickAndHold(driver.findElement(By.xpath("//div[@id='column-a']"))).moveToElement(driver.findElement(By.xpath("//div[@id='column-b']"))).release().build().perform();

	}

}
