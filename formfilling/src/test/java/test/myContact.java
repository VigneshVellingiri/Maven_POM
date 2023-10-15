package test;

import org.testng.annotations.Test;

import utilities.TestSetup;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class myContact {
	public static WebDriver driver;
	public static Properties prop;
	TestSetup obj = new TestSetup();
	
  @Test
  public void USER_LOGIN() {
	  
	  String URL = prop.getProperty("url");
	  
	  driver.get(URL);
	  driver.findElement(By.xpath("(//input[@name='user'])[1]")).sendKeys("Vignesh");
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
