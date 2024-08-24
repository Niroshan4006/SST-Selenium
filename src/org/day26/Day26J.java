package org.day26;

// To fetch row and cell number using normal for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26J {
	
		public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allRows.size(); i++) {
			
			WebElement row = allRows.get(i);
			
			List<WebElement> allData = row.findElements(By.tagName("td"));
			
			for (int j = 0; j < allData.size(); j++) {
				
				WebElement data = allData.get(j);
				String txt = data.getText();
				
				if (txt.equals("Canada")) {
					
					System.out.println(txt);
					System.out.println("Row no : "+i);
					System.out.println("Cell no : "+j);
					
					break;
					
				}
				
			}
			
		}

}
}