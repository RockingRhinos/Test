package hooks;

import base.ProjectSpecificMethods;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksForLeafTaps extends ProjectSpecificMethods{
	
	@Before
	public void methodBefore(Scenario sc) {
		launchBrowser();
	}
	
	@After
	public void methodAfter(Scenario sc) {
		closeBrowser();
		System.out.println(sc.getStatus());
	}
	
}
