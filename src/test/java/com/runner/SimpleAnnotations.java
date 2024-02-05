package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	@BeforeSuite
	private void property() {
		System.out.println("PropertySetting");

	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser");

	}

	@BeforeClass
	private void url() {
		System.out.println("url");

	}

	@BeforeMethod
	private void Loginpage() {
		System.out.println("Login");

	}

	@Test
	private void men() {

		System.out.println("Men cart added");

	}

	@Test

	private void women() {
		System.out.println("Women cart added");

	}

	@Test
	private void kids() {
		System.out.println("Kids cart added");

	}

	@AfterMethod
	private void logOut() {
		System.out.println("LogOut");

	}

	@AfterClass

	private void screenshot() {
		System.out.println("ScreenShot");

	}

	@AfterTest

	private void close() {
		System.out.println("Close");

	}

	@AfterSuite

	private void quit() {
		System.out.println("Quit");

	}

}
