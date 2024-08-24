package org.day26;

// Print no. of tables present in the webpage


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26A {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		List<WebElement> allTable = driver.findElements(By.tagName("table"));
		
		System.out.println("No of Tables present in the webpage : "+allTable.size());
		
		
	}

}
