package org.DropDown;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement country = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		country.click();
		Select count = new Select(country);
		
		//Find no of options
		
		List<WebElement> options = count.getOptions();
		System.out.println(options.size());
		
		//Capture All the options
		
		for(WebElement alloptions:options) {
			System.out.println(alloptions.getText());
			
		}
		
		//Select the option using by index
		
		count.selectByIndex(3);
		Thread.sleep(2000);
		
		//Select the option using VisibleText
		
		count.selectByVisibleText("Armenia");
		Thread.sleep(2000);
		
		//Select the option using value
		count.selectByValue("BRA");
		Thread.sleep(2000);
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
