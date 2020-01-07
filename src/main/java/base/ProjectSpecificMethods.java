package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethods {

	public static ChromeDriver driver;
	public static String excelFileName;

	@BeforeMethod
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public static void closeBrowser() {
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		
//		 String[][] data = new String[2][2];
		  
//		 data[0][0] = "demosalesmanager"; data[0][1] = "crmsfa";
//		 data[1][0] = "democsr"; data[1][1] = "crmsfa";
		  
//		 return data;
		
		return ReadExcel.readExcel(excelFileName);


	}

}
