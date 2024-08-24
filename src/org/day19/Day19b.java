package org.day19;

//Send keys and click and get values of send keys

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19b {
	
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		txtEmail.sendKeys("Niroshan@gmail.com");
		String email = txtEmail.getAttribute("value");
		System.out.println(email);
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@name='pass']"));
		txtPass.sendKeys("9876543210");
		String pass = txtPass.getAttribute("placeholder");
		System.out.println(pass);
		
		WebElement txtTag = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	    String txt = txtTag.getText();
	    System.out.println(txt);
	    
	    WebElement txtTag1 = driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
	    String txt1 = txtTag1.getText();
	    System.out.println(txt1);
	    
	    WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
	}

}
