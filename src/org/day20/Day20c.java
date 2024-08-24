package org.day20;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// to use drag and drop one after another

public class Day20c {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement s = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement t = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(s, t).perform();
		
		WebElement s1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement t1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(s1, t1).perform();
	}

}
