package org.day26;

// To fetch 5th and 6th row using normal for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26I {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allRows.size(); i++) {
			
			if (i==5 || i==6) {
				
				WebElement row = allRows.get(i);
				
				List<WebElement> allData = row.findElements(By.tagName("td"));
				
				for (int j = 0; j < allData.size(); j++) {
					
					WebElement data = allData.get(j);
					
					System.out.println(data.getText());
					
				}
				
			}
			
		}
	}

}
