package org.day24;

//Print the values of multiple dropdown by first selected

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24f {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id='fruits']"));
		
		WebElement fruitsdropdown = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruitsdropdown);
		
		if (s.isMultiple()) {
			
			System.out.println("Multiple options");
			
		} else {
			
			System.out.println("only one option");

		}
		
		s.selectByValue("banana");
		s.selectByVisibleText("Orange");
		s.selectByIndex(3);
		
		s.deselectByIndex(1);
		
		WebElement firstSelected = s.getFirstSelectedOption();
		
		System.out.println("First Selected Option : "+firstSelected.getText());
		System.out.println("First Selected Option : "+firstSelected.getAttribute("value"));

}


}
