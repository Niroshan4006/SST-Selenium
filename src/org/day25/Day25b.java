package org.day25;

//To go from one window to another window by set to List(collection) using Windows handling

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day25b {
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("wireless earbuds");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='OnePlus Nord Buds 2r True Wireless in Ear Earbuds with Mic, 12.4mm Drivers, Playback:Upto 38hr case,4-Mic Design, IP55 Rating [Deep Grey]']")).click();
		
		//To fetch parent window ID 
		String par = driver.getWindowHandle();
		System.out.println(par);
		
		// To fetch parent and child window ID
		Set<String> pc = driver.getWindowHandles();
		System.out.println(pc);
		
		List<String> li = new ArrayList<String>();
		li.addAll(pc);
		
		driver.switchTo().window(li.get(1));
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
	}

}
