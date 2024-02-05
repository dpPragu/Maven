package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.Maven.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\praga\\eclipse-workspace\\Maven\\src\\test\\java\\com\\feature\\Adaction.feature",
glue = "com.stepdefinition")
public class Adactin {
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserlaunch() {
		driver = Base_Class.launchBrowser("chrome");
		
	}
	}
	


