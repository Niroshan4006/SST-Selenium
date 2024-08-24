package org.day22;

//Take screen shot

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day22b {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File def = tk.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Niros\\eclipse-workspace\\Selenium\\ScreenShot\\fb.png");
		
		FileUtils.copyFile(def, des);
	}
	

}
