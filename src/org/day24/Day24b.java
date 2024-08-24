package org.day24;

//Print the dropdown list

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24b {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement monthdropdown = driver.findElement(By.id("month"));
		
		Select s = new Select(monthdropdown);
		
		if (s.isMultiple()) {
			
			System.out.println("Multiple options");
			
		} else {
			
			System.out.println("only one option");

		}
		
		s.selectByValue("10");
		s.selectByVisibleText("Nov");
		s.selectByIndex(5);
		
		List<WebElement> allOptions = s.getOptions();
		
		int n = allOptions.size();
		
		System.out.println("No of Options : "+n);
		
		for (int i = 0; i < allOptions.size(); i++) {
			
			WebElement eachOpt = allOptions.get(i);
			
			System.out.println(eachOpt.getText());
			
		}
		
		
	}


}
