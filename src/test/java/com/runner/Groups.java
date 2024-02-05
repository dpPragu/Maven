package com.runner;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "VEG")
	private void panner() {
		System.out.println("Panner");

	}

	@Test(groups = "VEG")
	private void curd() {
		System.out.println("Curd");

	}

	@Test(groups = "VEG")
	private void rice() {
		System.out.println("Rice");

	}

	@Test(groups = "NONVEG")
	private void briyani() {
		System.out.println("Briyani");

	}

	@Test(groups = "NONVEG")
	private void mutton() {
		System.out.println("Mutton");

	}

	@Test(groups = "NONVEG")
	private void fish() {
		System.out.println("Fish");

	}

}
