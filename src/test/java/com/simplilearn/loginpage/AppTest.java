
package com.simplilearn.loginpage;


import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

	private By emailBy = By.id("usernameField");
	private By passwordBy = By.id("passwordField");
	private By loginBy = By.xpath("//button[normalize-space()='Login']");
	protected WebDriver driver;
	@Given("User Opens the Chrome for website")
	public void userRun() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("user enter the url {string} to open an company  loginpage")
	public void userRun2(String string) {
		driver.get(string);
	}
	
	@When("user enter correct username {string} and password {string}")
	public void userRun6(String string1,String string2) {
		
		driver.findElement(emailBy).sendKeys("string1");
		driver.findElement(passwordBy).sendKeys("string2");
		driver.findElement(loginBy).click();
	}
	
	@Then("User navigate to {string} home page")
	public  void userRun3(String string)  {
		
		String actualTitle = driver.getTitle();
		Assertions.assertEquals(string,actualTitle);
		System.out.println(driver.getCurrentUrl());
	}
	
	@After
	public  void userRun4() {
		driver.close();
	}
}
