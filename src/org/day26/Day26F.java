package org.day26;

// to fetch all data without heading using enhanced for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26F {
	
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRow = table.findElements(By.tagName("tr"));
		
		for (WebElement row : allRow) {
			
			List<WebElement> allData = row.findElements(By.tagName("td"));
			
			for (WebElement data : allData) {
				
				System.out.println(data.getText());
				
			}
			
			
		}
		
		
	}

}
