package org.day26;

// To fetch the last cell of last row

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26K {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		WebElement lastRow = allRows.get(allRows.size()-1);
		
		List<WebElement> allData = lastRow.findElements(By.tagName("td"));
		
		WebElement lastData = allData.get(allData.size()-1);
		
		System.out.println(lastData.getText());
		

}
}