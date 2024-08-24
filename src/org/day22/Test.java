package org.day22;

// workout excercise

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File def = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Niros\\eclipse-workspace\\Selenium\\ScreenShot\\1.png");
		FileUtils.copyFile(def, des);
		
		
	}

}
