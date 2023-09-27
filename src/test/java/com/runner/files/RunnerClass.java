package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Mumi17\\ProjectClass\\CucumberAug\\src\\test\\java\\com\\feature\\files\\LoginnPage.feature", 
				 glue = "com.stepdefinition.files", 
				 //dryRun = true) //not execute the code, just returns the missed snippet
				 //strict = true) //execute the code and then returns the missed snippet
				 //monochrome = true) //ignore the human unreadable data
				 //previously we used format but it was removed so, now we go for plugins
				 plugin = {"json:reports/login.json"}
		)
public class RunnerClass {

}
