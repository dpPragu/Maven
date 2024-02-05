package com.stepdefinition;

import com.Maven.Base_Class;
import com.poma.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStep extends Base_Class {

	public PageObjectManager pom = new PageObjectManager(driver);
//
//	@Given("^user Must Launch The Url \"([^\"]*)\"$")
//	public void user_Must_Launch_The_Url(String arg1) throws Throwable {
//		launchBrowser(arg1);
//	}
//
//	@When("^user Must Enter The User Name \"([^\"]*)\" In User Name Field$")
//	public void user_Must_Enter_The_User_Name_In_User_Name_Field(String arg1) throws Throwable {
//		passInput(pom.getlp().getUsername(), arg1);
//	}
//
//	@When("^user Must Enter The Password \"([^\"]*)\" In The Password Field$")
//	public void user_Must_Enter_The_Password_In_The_Password_Field(String arg1) throws Throwable {
//		passInput(pom.getlp().getPassword(), arg1);
//	}
//
//	@Then("^user Must Click The Login Button And Its Navigate To Home Page$")
//	public void user_Must_Click_The_Login_Button_And_Its_Navigate_To_Home_Page() throws Throwable {
//		clickButton(pom.getlp().getLogin());
//	}

	@Given("^user Must Launch The Url \"([^\"]*)\"$")
	public void user_Must_Launch_The_Url(String arg1) throws Throwable {
		launchBrowser(arg1);
	}

	@When("^user Must Enter The User Name \"([^\"]*)\" In User Name Field$")
	public void user_Must_Enter_The_User_Name_In_User_Name_Field(String arg1) throws Throwable {
		passInput(pom.getlp().getUsername(), arg1);
	}

	@When("^user Must Enter The Password \"([^\"]*)\" In The Password Field$")
	public void user_Must_Enter_The_Password_In_The_Password_Field(String arg1) throws Throwable {
		passInput(pom.getlp().getPassword(), arg1);
	}

	@Then("^user Must Click The Login Button And Its Navigate To Home Page$")
	public void user_Must_Click_The_Login_Button_And_Its_Navigate_To_Home_Page() throws Throwable {
		clickButton(pom.getlp().getLogin());
	}

}
