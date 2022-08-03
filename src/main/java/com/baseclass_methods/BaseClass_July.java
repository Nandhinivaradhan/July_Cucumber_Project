package com.baseclass_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_July {
	
	public static WebDriver driver;  //NULL DRIVER
	public static WebDriver getBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") +"\\Driver\\chromedriver1.exe");
			driver=new ChromeDriver();	
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") +"\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();	
			
		}
		
		driver.manage().window().maximize();
		return driver;

	}
	public static void clickButton(WebElement element) {
		element.click();

	}
	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);

	}
	
	public static void closeBrowser() {
		driver.close();

	}	
	public static void getUrl(String url) {
		driver.get(url);

	}	
	public static void dropDown(WebElement element, String typ, String val) {
		
		Select s=new Select(element);
		
		if(typ.equalsIgnoreCase("selectbyvalue")) {
			s.selectByValue(val);
			
		}
		else if(typ.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(val);
			
		}
		
		else if(typ.equalsIgnoreCase("index")) {
			int index_value = Integer.parseInt(val);
			s.selectByIndex(index_value);
			
			
			
		}
		

	}
	
	
	
	

}
