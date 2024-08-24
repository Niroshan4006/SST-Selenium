package org.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// To use KeysDown, double click, context click 

public class Day20e {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement txt = driver.findElement(By.id("email"));
		
		a.keyDown(Keys.SHIFT).sendKeys("Niroshan").perform();
		
		a.doubleClick(txt).perform();
		
		a.contextClick(txt).perform();
	}
	

}
