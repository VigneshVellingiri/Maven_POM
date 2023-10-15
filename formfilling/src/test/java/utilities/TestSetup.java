package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSetup {
	public static WebDriver driver;
	public static Properties prop;
	
	public static void getBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrom.driver", "D:\\Qtree Tech\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(Browser.equalsIgnoreCase("firfox")) {
			System.setProperty("webdriver.geko.driver", "D:\\Qtree Tech\\Selenium\\Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	static {
		try {
			File f = new File("C:\\Users\\vigne\\git\\Maven_POM\\formfilling\\src\\test\\java\\Input.properties");
			FileInputStream soure = new FileInputStream(f);
			
			prop = new Properties();
			prop.load(soure);
			
		}
		catch(Exception e){
			
			
		}
	}

}
