package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends ProjectSpecificMethods{

	@Given("Enter the username as (.*)")
	public LoginPage enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	@And("Enter the password as (.*)")
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	@When("Click login")
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
	
}
