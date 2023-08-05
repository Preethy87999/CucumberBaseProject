package com.simplilearn.seleniumcucumber;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStepsDefinition {

	WebDriver driver;
	@Given("User Opens the Chrome Browser")
	public void userRun() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@When("user enter the url {string}")
	public void userRun2(String string) {
		
		driver.get(string);
	}
	
	@Then("Title of this page should be {string}")
	public  void userRun3(String string) {
		String actualTitle = driver.getTitle();
		Assertions.assertEquals(string,actualTitle);
	}
	
	@After
	public  void userRun4() {
		driver.close();
	}
}
