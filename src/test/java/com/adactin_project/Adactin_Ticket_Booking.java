package com.adactin_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass_methods.BaseClass_July;
import com.helpherfile.FileReadManager;
import com.pojo_pom.LoginPage;
import com.pojo_pom.PageObjectManager;
import com.pojo_pom.SearchHotel;

public class Adactin_Ticket_Booking extends BaseClass_July{
	
	public static void main(String[] args) throws IOException {
	
		driver=getBrowser("CHROME");
		
		getUrl("https://adactinhotelapp.com/");
		
		PageObjectManager pom=new PageObjectManager(driver);
	
		inputText(pom.getInstanceLp().getUsername(), FileReadManager.instanceFRM().instanceCR().getUsername());
		
		inputText(pom.getInstanceLp().getPass(), FileReadManager.instanceFRM().instanceCR().getPassword());
		
		clickButton(pom.getInstanceLp().getSubmit());
		
		dropDown(pom.getInstanceSearch().getLoc(), "index", "2");
		
		
		//driver.close();
		
		
		
	}

}
