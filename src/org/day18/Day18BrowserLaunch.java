package org.day18;

//Browser Launch

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18BrowserLaunch {
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gsmarena.com/");
		
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL : "+url);
		
		driver.close();
	}


}
