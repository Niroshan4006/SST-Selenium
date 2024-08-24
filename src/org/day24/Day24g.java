package org.day24;

//To print all the options in the multiple dropdown

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24g {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id='fruits']"));
		
		WebElement fruitsdropdown = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruitsdropdown);
		
		//To fetch all options
		
		List<WebElement> allOptions = s.getOptions();
		
		for (int i = 0; i < allOptions.size(); i++) {
			
			WebElement eachOption = allOptions.get(i);
			
			System.out.println(eachOption.getText());
			
		}

}
}