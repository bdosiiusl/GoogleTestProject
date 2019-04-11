package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // launch Chrome
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	
	@Test (priority=1) //1
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("title");
	}	
	
	@Test (priority=2) //2
	public void googleLogoTest() {
	boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
	}
	
	@Test (priority=3) //3
	public void mailLinkTest() {
	boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void takedown(){
		driver.quit();
		}
	}
	
	
	


