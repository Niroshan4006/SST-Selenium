package org.day24;

//Print all options for and Enhanced for loop

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24k {
	
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select s = new Select(fruits);
		
		List<WebElement> all = s.getOptions();
		
		System.out.println("\nNormal for Loop");
		
		for (int i = 0; i < all.size(); i++) {
			
			WebElement each1 = all.get(i);
			
			System.out.println(each1.getText());
			
		}
		
		System.out.println("\nEnhanced For Loop");
		
		for (WebElement each2 : all) {
			
			System.out.println(each2.getText());
			
		}
		
		
	}
 
}
