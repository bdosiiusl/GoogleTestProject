package google.Test.Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	// Pre-conditions  annotations -- starting with @Before
	
	@BeforeSuite //1
	public void setUp(){
		
		System.out.println("set up system property for chrome");	
	}
	
	@BeforeTest() //2
	public void launchBrowser(){
		System.out.println("launch chrome browser");
	}
	
	@BeforeClass //3
	public void login(){
	  
		System.out.println("login to app");
	}
	
	@BeforeMethod //4
	public void enterURL(){
		System.out.println("Enter URL");
		
		//Sequence a test case should follow when writing automated script as seen below in the two test cases
		/*@BeforMethod
		 * @Test -1 
		 * @AfterMethod
		 *
		 * @BeforMethod
		 * @Test -2
		 * @AfterMethod
		 * 
		 * @BeforMethod
		 * @Test -3
		 * @AfterMethod
		 * 
		 */
	}
	
	//Test cases -- starting with @Test 
	
	@Test //5
	public void googleTitleTest(){
		System.out.println("Google Title Test");
	}
	
	@Test 
	public void searchTest(){
		System.out.println("Serach Test");
	}
	
	@Test 
	public void googleLogoTest(){
		System.out.println("Goole Logo Test");
	}
	
	//Post-Conditions -- starting with @After
	
	@AfterMethod //6
	public void logOut(){
		System.out.println("Logout out of app");
	
	}
	
	@AfterTest //8
	public void deleteallCookies(){
	System.out.println("deleteallCookies");
	
	}
	
	@AfterClass //7
	public void closeBrowser(){
	System.out.println("Close Browser");
	
	}
	
	@AfterSuite //9
	public void generateTestReports(){
	System.out.println("Generate Test Reports");
	
	}
	
	
	
	
}
