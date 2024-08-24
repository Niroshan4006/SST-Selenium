package org.day26;

//To fetch middle cell of middle row

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day26L {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		WebElement middleRow = allRows.get(allRows.size()/2);
		
		List<WebElement> allData = middleRow.findElements(By.tagName("td"));
		
		WebElement middleData = allData.get(allData.size()/2);
		
		System.out.println(middleData.getText());

}
}