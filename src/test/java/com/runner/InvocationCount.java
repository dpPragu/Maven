package com.runner;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 2)
	private void browserLaunch() {

		System.out.println("chromeopen");

	}

	@Test(invocationCount = 1)
	private void urlLaunch() {
		System.out.println("Url");

	}

	@Test
	private void Login() {
		System.out.println("Login");

	}

}
