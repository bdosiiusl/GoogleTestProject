	package google.Test.Project;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	@Test(invocationTimeOut=2000)
//	public void infiniteloopTest() {
//		int i= 1;
//		while(i==1)
//			System.out.println(1);
//
//	}
	
	@Test(expectedExceptions=NumberFormatException.class) 
	public void test() {
		
		String x = "100A";
		Integer.parseInt(x);
	}
}
	
