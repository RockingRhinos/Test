package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class FindLeadsPage extends ProjectSpecificMethods {

	@And("Enter first name in find leads as (.*)")
	public FindLeadsPage enterFirstNameInFindLeads(/* String fName */) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]"))/* .sendKeys(fName) */;
		return this;
	}
	
	@And("Click on Find Leads Submit button")
	public FindLeadsPage clickSubmitFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	@When("Click on the first resulting lead")
	public ViewLeadPage clickFirstResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		WebElement firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		firstLead.click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.elementToBeClickable(firstLead)).click();
		 */
		return new ViewLeadPage();
	}
	
}
