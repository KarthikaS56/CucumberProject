package com.stepdefinition.files;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.without.pagefactory.FlipkartPageLocators;

public class FlipkartStepDefinition extends BaseClass{
	@Given("Launch the Flipkart URL")
	public void launch_the_flipkart_url() {
		loadUrl("https://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		impWait(10);
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement.click();
}

	@When("Search for Dell laptop")
	public void search_for_dell_laptop() {
		impWait(30);
		WebElement laptopsearch = findElementAB(FlipkartPageLocators.search);
		laptopsearch.click();
		laptopsearch.sendKeys("Dell Laptop"+Keys.ENTER);
	}

	@When("Click on First Product in PLPPage")
	public void click_on_first_product_in_plp_page() {
		WebElement dell = findElementAB(FlipkartPageLocators.laptop);
		dell.click();
		
	  
	}

	@When("Click on Add to Cart")
	public void click_on_add_to_cart() {
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for (String s : child) {
		if (!parent.equals(s)) {
		driver.switchTo().window(s);
		}
		}
		WebElement cartbutton = findElementAB(FlipkartPageLocators.add);
		cartbutton.click();
	   
	}

	@Then("Validate the product was added into the Cart")
	public void validate_the_product_was_added_into_the_cart() {
		String text1= findElementAB(FlipkartPageLocators.header).getText();
		String text2= findElementAB(FlipkartPageLocators.cart).getText();
		if(text2.contains(text1))
			 System.out.println("Dell laptop added successfully");
			 else
			 System.out.println("Dell laptop not added");

	}



	

}