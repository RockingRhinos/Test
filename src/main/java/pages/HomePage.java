package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods{

	@And("Verify login success")
	public HomePage verifyLogin() {
		String welcomeDemoSales = driver.findElement(By.xpath("//h2[contains(.,'Demo')]")).getText();
		if (welcomeDemoSales.contains("Demo")) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");
		}
		return this;
	}
	
	@Then("Click logout")
	public HomePage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	
	@And("Click on CRMSFA")
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}
