package org.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDSample {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement country = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		Select count = new Select(country);
		
		//No of Options
		
		List<WebElement> options = count.getOptions(); //249
		
		System.out.println(options.size());
		
		//Capture all the options
		
		for(WebElement alloptions:options) {
			System.out.println(alloptions.getText());
		}
		
		//Select an option
		
		count.selectByIndex(8);//249  ---->0 to 248
		
		Thread.sleep(3000);
		
		count.selectByValue("CAN");
		
		Thread.sleep(3000);
		
		count.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
	
		
		
		

	}

}
