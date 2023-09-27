package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\CucumberAug\\src\\test\\java\\com\\feature\\files",
				 glue="com.stepdefinition.files", 
				 //tags=("@smoke"))//to trigger single tag
				 //tags=("@smoke and @sanity")) //to execute the scenario which had these two tags(based on AND)
				 //tags=("@homepage or @loginpage")) //to execute the scenario which had these two tags(based on OR)
				 //tags=("not @regression")) //to ignore the tag from execution
				 tags=("@Background")) //to execute single feature file
public class TagsRunner {

}
