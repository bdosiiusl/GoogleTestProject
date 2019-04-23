package google.Test.Project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbdayTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // launch Chrome
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	@DataProvider
	public void getTestData(){	
		
	}
		
	@Test(dataProvider="getTestData")
	public void HalfEbayRegPageTest(String Fistrname, String Surname, String Email, String password){
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
}
	
}	
