package com.stepdefinition.files;

import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.without.pagefactory.LoginPageLocators;

public class LoginStepDefinition extends BaseClass{
	@Given("Open the browser")
	public void open_the_browser() {
	    browserOpen("chrome");
	}

	@Given("Launch the Adactin URL")
	public void launch_the_adactin_url() {
	    loadUrl("https://adactinhotelapp.com/");
	}
	
	@Then("Validate URL Launched")
	public void validate_url_launched() {
	    if(getCurrentUrl().equals("https://adactinhotelapp.com/")) {
	    	System.out.println("Adactin URL Launched Successfully");
	    }else {
	    	System.out.println("Adactin URL not Launched");
	    }
	}

	@When("Enter username as {string}")
	public void enter_username_as(String string) {
		WebElement username = findElementAB(LoginPageLocators.user);
		dataSend(username, string);
	}

	@When("Enter password as {string}")
	public void enter_password_as(String string) {
	    WebElement password = findElementAB(LoginPageLocators.pwd);
	    dataSend(password, string);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    click(findElementAB(LoginPageLocators.loginBtn));
	}

	@Then("Validate user logged in or not")
	public void validate_user_logged_in_or_not() {
	   String url = getCurrentUrl();
	   if(url.contains("SearchHotel")) {
		   System.out.println("User logged in");
	   }else {
		   System.out.println("User not logged in");
	   }
	}

}
