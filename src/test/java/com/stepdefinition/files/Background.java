package com.stepdefinition.files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Background {

	@Given("Open browser {string} and Launch Amazon URL")
	public void open_browser_and_launch_amazon_url(String string) {
		System.out.println(""+string+" browser opened & Amazon URL Launched");
	}

	@When("Click on Sign in")
	public void click_on_sign_in() {
	    System.out.println("SignIn button clicked");
	}

	@When("Click on Start here")
	public void click_on_start_here() {
	    System.out.println("Start here clicked");
	}

	@When("Click on location")
	public void click_on_location() {
	    System.out.println("Location clicked");
	}

}
