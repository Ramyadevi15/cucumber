package org.step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	WebDriver driver;

	@Given("user enters in to login page")
	public void user_enters_in_to_login_page() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
		


	   @When("user enters their  {string} and {string}")
		public void user_enters_their_and (String username, String password) {
		
		}
		@When("user enters their  username and password")
		public void user_enters_their_username_and_password(io.cucumber.datatable.DataTable dataTable) {
			//1D without header
			
		List<String> asList = dataTable.asList();
		String email = asList.get(0);
			WebElement txtemail = driver.findElement(By.id("email"));
			txtemail.sendKeys(email);
			String pass = asList.get(1);
			WebElement txtpass = driver.findElement(By.id("pass"));
			txtpass.sendKeys(pass);
		}
			

	@When("user click in to the login button")
	public void user_click_in_to_the_login_button() {
	    WebElement loginbtn = driver.findElement(By.name("login"));
	    loginbtn.click();
	}

	@Then("page displayed error message")
	public void page_displayed_error_message() {
	    System.out.println("Message is error");
	    System.out.println("displayed err message");
	}




}
