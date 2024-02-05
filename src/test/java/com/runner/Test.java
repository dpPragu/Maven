package com.runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Maven.Base_Class;

public class Test extends Base_Class{
	public static void main(String[] args) throws IOException {
	
		launchBrowser("chrome");
		launchUrl("https://www.amazon.in/");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		passInput(element,"Realme");
		WebElement element2 = driver.findElement(By.id("nav-search-submit-button"));
		clickButton(element2);
		screenShot("C:\\Users\\praga\\eclipse-workspace\\Maven\\screenshot\\test.png");
		terminateBrowser();
	}
	

}
