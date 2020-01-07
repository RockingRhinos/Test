package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethods{

	@Then("Verify First Name as (.*)")
	public ViewLeadPage verifyLeadFirstName(String fName) {

		String enteredFName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(enteredFName.equals(fName)) {
			System.out.println("Created the Lead");
		}else {
			System.out.println("Lead not Created");
		}
		return this;
	}

	@Then("Click on the Delete button")
	public ViewLeadPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return this;
	}

}
