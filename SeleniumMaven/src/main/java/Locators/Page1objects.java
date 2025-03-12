package Locators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.Browser;
import Pages.Page1;
public class Page1objects extends Browser{
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement loginButton;
	
	
	
	
		static By searchTextBox = By.id("APjFqb");
	public static By searchUsername = By.name("username");
	public static By searchPassword = By.name("password");
	public static By searchLogin = By.cssSelector("[type='submit']");
	/*
	 * 
	 * Method to get element of search text box and store it
	 * 
	 */

	public static WebElement username() {
		
		wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		return driver.findElement(searchUsername);


	}
	
	public static WebElement password() {
		return driver.findElement(searchPassword);
	}
	
	public static WebElement login() {
		return driver.findElement(searchLogin);
	}

//Page1Objects,java where elements are recognized.
}
