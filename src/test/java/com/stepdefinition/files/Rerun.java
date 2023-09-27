package com.stepdefinition.files;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class Rerun {

	@Given("Rerun Scenario step one")
	public void rerun_scenario_step_one() {
		System.out.println("Rerun Scenarion one");
		Assert.assertTrue(false);
	}

	@Given("Rerun Scenario step two")
	public void rerun_scenario_step_two() {
		System.out.println("Rerun Scenarion two");
	}

	@Given("Rerun Scenario step three")
	public void rerun_scenario_step_three() {
	   System.out.println("Rerun Scenarion three");
	   Assert.assertTrue(false);
	}
}
