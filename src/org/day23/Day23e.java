package org.day23;

//Number of radio buttons

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23e {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> allradiobtn = driver.findElements(By.xpath("//input[@type='radio']"));
		
		int s = allradiobtn.size();
		
		System.out.println("Number of radio buttons : "+s);
		
		
	}

}
