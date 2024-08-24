package org.day26;

// To fetch a single Data

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26B {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRow = table.findElements(By.tagName("tr"));
		
		WebElement row = allRow.get(3);
		
		List<WebElement> allData = row.findElements(By.tagName("td"));
		
		WebElement data = allData.get(2);
		
		System.out.println(data.getText());
	}

}
