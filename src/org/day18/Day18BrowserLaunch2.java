package org.day18;

//Browser Launch

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18BrowserLaunch2 {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("niroshan@gmail.com");
		
		WebElement txtPass = driver.findElement(By.name("pass"));
		txtPass.sendKeys("987543210");
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
	}

}
