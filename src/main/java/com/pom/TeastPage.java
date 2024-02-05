package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeastPage {
	
	public WebDriver driver;
	
	@FindBy (id="twotabsearchtextbox")
	private WebElement realme;
	
	
	@FindBy (id="nav-search-submit-button")
	private WebElement search;
	
	
	
	

}
