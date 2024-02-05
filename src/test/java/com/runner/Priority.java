package com.runner;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 2)

	private void browserLaunch() {

		System.out.println("chromeopen");

	}

	@Test(priority = 6)

	private void urlLaunch() {
		System.out.println("Url");

	}

	@Test(priority = 0)
	private void Login() {
		System.out.println("Login");

	}


}
