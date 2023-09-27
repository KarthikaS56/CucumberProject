package com.stepdefinition.files;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;

public class ParallelStepdefinition extends BaseClass{
	@Given("Launch the Amazon URL")
	public void launch_the_amazon_url() throws Throwable {
	    loadUrl("https://www.amazon.in/");
	    Thread.sleep(3000);
	    pageClose();
	}

	@Given("Launch the Flipkart URL")
	public void launch_the_flipkart_url() throws InterruptedException {
	    loadUrl("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    pageClose();
	}

	@Given("Launch the Facebook URL")
	public void launch_the_facebook_url() throws InterruptedException {
	    loadUrl("https://www.facebook.com/");
	    Thread.sleep(3000);
	    pageClose();
	}
}
