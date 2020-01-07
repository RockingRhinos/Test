package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateLead extends ProjectSpecificMethods{

	@And("Enter company name as (.*)")
	public CreateLead enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	
	@And("Enter first name as (.*)")
	public CreateLead enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	@And("Enter last name as (.*)")
	public CreateLead enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	@When("Clicking on Submit button")
	public ViewLeadPage clickOnSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
	
}
