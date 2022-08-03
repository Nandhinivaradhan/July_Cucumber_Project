package com.pojo_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	//collection of objects
	
	public static WebDriver driver; // Null Driver
	
	private LoginPage lp;
	private SearchHotel search;

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public LoginPage getInstanceLp() {
		
		lp=new LoginPage(driver);
		return lp;
	}
	
	
	public SearchHotel getInstanceSearch() {
		
		search=new SearchHotel(driver);
		return search;
	}
	
	
	
	
	

}
