package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\CucumberAug\\src\\test\\java\\com\\feature\\files\\Rerunn.feature",
				 glue="com.stepdefinition.files", 
				 plugin= {"rerun:target/FailedScenarios.txt"})

public class SampleRunner {

}
