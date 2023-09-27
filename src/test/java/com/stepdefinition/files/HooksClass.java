package com.stepdefinition.files;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {

	@Before
	public void beforeScenario() {
		System.out.println("It will executed before the Scenario");
	}
	
	@After 
	public void afterScenario() {
		System.out.println("It will executed after the Scenario");
	}
}
