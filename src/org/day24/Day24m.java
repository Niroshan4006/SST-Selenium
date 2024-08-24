package org.day24;
//remove all

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24m {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(fruits);
		s.selectByIndex(1);
		s.selectByValue("grape");
		
		List<WebElement> all = s.getOptions();
		System.out.println("\n Enhanced for Loop");
		for (WebElement each : all) {
			System.out.println(each.getText());
			
		}
		
		List<WebElement> allSel = s.getAllSelectedOptions();
		int n = allSel.size();
		System.out.println("\n No of Selected options :"+n);
		
		System.out.println("\n List of Selected Options");
		for (int i = 0; i < allSel.size(); i++) {
			WebElement sel = allSel.get(i);
			System.out.println(sel.getText());
			
		}
		all.removeAll(allSel);
		System.out.println("\n List of Non-Selected options");
		for (int i = 0; i < all.size(); i++) {
			WebElement non = all.get(i);
			System.out.println(non.getText());
			
		}
	}

}
