package org.day27;

//implicit and explicit wait----webdriver wait

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day27C {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    // implicit wait
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));   //explicit wait
		
		w.until(ExpectedConditions.elementToBeClickable(By.name("login")));     // here explicit wait runs
		
		driver.findElement(By.name("login")).click();                           // here implicit wait runs
	}

}
