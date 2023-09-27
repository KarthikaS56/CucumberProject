package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/FailedScenarios.txt", 
				 glue="com.stepdefinition.files")
public class ReRunner {

}
