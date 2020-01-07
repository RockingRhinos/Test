package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.And;

public class MyLeadsPage extends ProjectSpecificMethods {

	@And("Click on CreateLead")
	public CreateLead clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}
	
	@And("Click on Find Leads")
	public FindLeadsPage clickOnFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage();
	}
	
}
