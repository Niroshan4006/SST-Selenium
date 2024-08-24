package org.day22;

//Java Script Executor

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class Day22a {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Niroshan@gmail.com')", txtEmail);
		
		WebElement txtPass = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','9876543210')", txtPass);
		
		WebElement btn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btn);
		
		Object o = js.executeScript("arguments[0].getAttribute['value']", txtEmail);
		System.out.println();
	}

}
