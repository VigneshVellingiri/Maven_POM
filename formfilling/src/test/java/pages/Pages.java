package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	public static WebDriver driver;
	
	@FindBy(xpath = "(//input[@name='user'])[1]")
	public WebElement UserName;
	
	@FindBy(xpath = "//input[@name='pass']")
	public WebElement Password;
	
	
	public Pages( WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
