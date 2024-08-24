package org.day23;

//using webelement reference

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23b {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		WebElement f = driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
		
		driver.switchTo().frame(f);
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	}
}
