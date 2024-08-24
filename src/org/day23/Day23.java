package org.day23;

//using webelement id


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
	}

}
