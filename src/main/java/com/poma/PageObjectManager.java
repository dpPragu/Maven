package com.poma;

import org.openqa.selenium.WebDriver;

import com.pom.Login_page;

public class PageObjectManager {
	
	public WebDriver driver;
	private Login_page lp;
	
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}



	public Login_page getlp() {
		
		if (lp==null) {
			lp = new Login_page(driver);
		}
		
		return lp;
	}

}
