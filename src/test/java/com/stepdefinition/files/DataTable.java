package com.stepdefinition.files;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTable {

	@Given("Open browser and launch adactin url")
	public void open_browser_and_launch_adactin_url() {
	    System.out.println("Browser opened & adactin URL Launched");
	}

	@When("Enter the username as List")
	public void enter_the_username_as_list(io.cucumber.datatable.DataTable dataTable) {
	  List<String> data = dataTable.asList();
	  System.out.println(data.get(0)); //Azra
	}

	@When("Enter the password as List")
	public void enter_the_password_as_list(io.cucumber.datatable.DataTable dataTable) {
	   List<String> data = dataTable.asList();
	   System.out.println(data.get(1));
	}
	
	@When("Enter the username as Lists")
	public void enter_the_username_as_lists(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>> data = dataTable.asLists();
	   System.out.println(data.get(0).get(1)); //Guhan
	}

	@When("Enter the password as Lists")
	public void enter_the_password_as_lists(io.cucumber.datatable.DataTable dataTable) {
		   List<List<String>> data = dataTable.asLists();
		   System.out.println(data.get(1).get(0)); //aishu123
	}
	
	@When("Enter the username as Map")
	public void enter_the_username_as_map(io.cucumber.datatable.DataTable dataTable) {
	  	Map<String, String> data = dataTable.asMap();
	  	System.out.println(data.get("Username")); //Aishu
	}

	@When("Enter the password as Map")
	public void enter_the_password_as_map(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
	  	System.out.println(data.get("Password")); //aishu123
	}

	@When("Enter the details as Maps")
	public void enter_the_details_as_maps(io.cucumber.datatable.DataTable dataTable) {
	  List<Map<String, String>> data = dataTable.asMaps();
	  System.out.println(data.get(0).get("Password")); //sasi123
	  System.out.println(data.get(1).get("Username")); //Karthika
	  System.out.println(data.get(2).get("Email"));//harish123@gmail.com
	}
}
