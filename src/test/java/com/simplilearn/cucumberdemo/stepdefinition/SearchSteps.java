package com.simplilearn.cucumberdemo.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	@Given("I have a search field on the Flipkart Home Page")
	public void iHaveASearchFieldOnFlipKartPage() {
		System.out.println("Step1: I am on search page");
	}

	@When("I search for a product named (string)")
	public void searchForProduct(String productName) {
		System.out.println("Step2: Search the product with name:"+productName);
	}
	
	@And("I enter the price as (string)")
	public void enterPrice(String price) {
		System.out.println("Step3: Enter a price:"+price);
	}
	
	@Then("Product with name \"MRFBat\" should be displayed")
	public void productDisplayed(String productName) {
		System.out.println("Step4: Product  "+productName+" is displayed");
	}
}
