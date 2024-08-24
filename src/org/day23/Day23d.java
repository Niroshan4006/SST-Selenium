package org.day23;

//WebElements and no. of frames


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day23d {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		
		int s = allframes.size();
		
		System.out.println("Number of frames : "+s);
	}

}
