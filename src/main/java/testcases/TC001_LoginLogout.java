package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

import pages.LoginPage;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName = "LoginTestData";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLoginLogou(String userName, String pass) {
		
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(pass)
		.clickLogin()
		.verifyLogin()
		.clickLogout();
		
	}
	
}
