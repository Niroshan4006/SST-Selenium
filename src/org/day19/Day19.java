package org.day19;

//Send keys and click

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		txtEmail.sendKeys("Niroshan.try@gmail.com");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@name='pass']"));
		txtPass.sendKeys("9876543210");
		
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		
		
	}

}
