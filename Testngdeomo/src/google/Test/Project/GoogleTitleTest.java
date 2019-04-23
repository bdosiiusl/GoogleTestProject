package google.Test.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod //C:\\Dev\chromedriver_win32
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // launch Chrome
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("title");
		Assert.assertEquals(title, "Google", "title is not matching"); // This point we validate, assert means validate
	}
	
	@Test 
	public void googleLogoTest() {
	boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
	//Assert.assertTrue(b);
	Assert.assertEquals(b, true);   //can be written like this aswell
	}
	
	@AfterMethod
	public void takedown(){
		driver.quit();
		}
	
	

}
