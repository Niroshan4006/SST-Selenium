package org.day27;

 //implicit and explicit wait----webdriver wait

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day27B {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    // implicit wait
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));   //explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));   // here explicit wait runs
		
		driver.findElement(By.id("email")).sendKeys("Smartskills");               // here implicit wait runs
	}

}
