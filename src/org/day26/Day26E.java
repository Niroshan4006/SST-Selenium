package org.day26;

// To fetch all data from all rows

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26E {
	
	public static void main(String[] args) {
			
	        WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
			
			System.out.println(table.getText());
	}

}
