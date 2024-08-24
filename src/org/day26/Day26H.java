package org.day26;

//to fetch all data with heading using normal for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26H {
	
		public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		WebElement heading = allRows.get(0);
		
		List<WebElement> allHeading = heading.findElements(By.tagName("th"));
		
		for (int i = 0; i < allHeading.size(); i++) {
			
			WebElement head = allHeading.get(i);
			System.out.println(head.getText());
			
		}
		
		for (int i = 0; i < allRows.size(); i++) {
			
			WebElement row = allRows.get(i);
			
			List<WebElement> allData = row.findElements(By.tagName("td"));
			
			for (int j = 0; j < allData.size(); j++) {
				
				WebElement data = allData.get(j);
				
				System.out.println(data.getText());
				
			}
			
		}

}
}