
package com.runner;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreCase {

	@Test

	private void browserLaunch() {

		System.out.println("chromeopen");

	}

	@Test(enabled = false)

	private void urlLaunch() {
		System.out.println("Url");

	}

	@Test
	@Ignore

	private void Login() {
		System.out.println("Login");

	}

}
