package Locators;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;
public class Page2objects extends Browser {
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	@CacheLookup
	public WebElement search;
	
	@FindAll(@FindBy(xpath="//ul[@class='oxd-main-menu']/li"))
	@CacheLookup
	public List<WebElement> list;
	
	
	
	
	
	
	public static By searchMenuElements = By.xpath("//ul[@class='oxd-main-menu']/li");
	public static By searchMenuName = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");
	
	public static List<WebElement> menuElements(){
		wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchMenuElements));
		return driver.findElements(searchMenuElements);
	}
	
	public static WebElement menuName(){
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchMenuName));
		
		return driver.findElement(searchMenuName);
	}
	
	
		
}
