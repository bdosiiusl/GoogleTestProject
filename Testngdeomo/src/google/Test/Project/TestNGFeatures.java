package google.Test.Project;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void logInTest(){
		System.out.println("login test");
		//int i = 9/0;
}
	@Test(dependsOnMethods="logInTest")
	public void HomePageTest(){
		System.out.println("HomePage Test");
}
	
	@Test(dependsOnMethods="logInTest")
	public void SearchPage(){
		System.out.println("SearhPage Test");
}
	
	@Test(dependsOnMethods="logInTest")
	public void RegitrationPage(){
		System.out.println("RegitrationPage Test");
	}	
}		
