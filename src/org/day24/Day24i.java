package org.day24;

//To print odd position in multiple dropdown


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24i {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		
		
		WebElement fruitsdropdown = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruitsdropdown);
		
		//To fetch odd positions options
		
		List<WebElement> allOptions = s.getOptions();
		
		for (int i = 1; i < allOptions.size(); i=i+2) {
			
			WebElement eachOption = allOptions.get(i);
			
			System.out.println(eachOption.getText());
			
		}
}

}
