package test;

import org.testng.annotations.Test;

import pages.Pages;
import utilities.TestSetup;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class myContact {
	public static WebDriver driver;
	public static Properties prop;
	TestSetup obj = new TestSetup();
	
  
  @Test(groups = {"demo"})
  public void USER_LOGIN() {
	  Reporter.log("Correct User name and password");
	  Pages page = new Pages(driver);
	  
	  String URL = prop.getProperty("url");
	  
	  driver.get(URL);
	  page.UserName.sendKeys("Vignesh@541");
	  page.Password.sendKeys("v@321");
	  
  }
  @Test(groups = {"demo"})
  public void TC_002() {
	  Reporter.log("Wrong User name and password");
	  Pages page = new Pages(driver);
	  String URL = prop.getProperty("url");
	  
	  driver.get(URL);
	  page.UserName.sendKeys("Vignesh@69");
	  page.Password.sendKeys("v@32");
	  
	  
  }
  
  @AfterTest
  public void AfterTest() {
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  this.driver = obj.driver;
	  this.prop = obj.prop;
  }
  
  @Parameters("Browser")
  @BeforeTest
  public void beforeTest(String Browser) {
	  obj.getBrowser(Browser);
  }
  
  @AfterSuite
  public void AfterSuite() {
	  driver.quit();
	  
  }

}
