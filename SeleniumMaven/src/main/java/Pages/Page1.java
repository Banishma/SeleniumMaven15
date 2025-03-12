package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import Browser.Browser;
import Locators.Page1objects;
import ScreenShot.Capture;
//import Locators.IOException;


public class Page1 extends Browser{
	
	
	
	public static WebDriverWait wait;

	static Page1objects obj;

	public static void enterLoginCredentials(String data, String data2) {
		obj = PageFactory.initElements(driver, Page1objects.class);

		obj.username.sendKeys(data);
		obj.password.sendKeys(data2);
		obj.loginButton.click();
	
}
	//public static WebDriverWait wait;
	
	//Method for getting the actual title
		public static String Title()
		{
			return driver.getTitle();
		}

	public static void usernameEnter(String str) throws Exception {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering username");
		logger1.log(Status.INFO,"Entering the username into the field variable");
		logger1.log(Status.INFO, "Screenshot");
		Thread.sleep(5000);
		logger1.addScreenCaptureFromPath(Capture.screenShot("title"));
		extent.flush();
		try 
		{	
				Page1objects.username().sendKeys(str);
				logger1.log(Status.PASS,"username entered successfully");
		}
		catch(Exception E)
		{
			System.out.println("Username :"+E);
			logger1.log(Status.FAIL,"Error occured in entering the username");
		}
		extent.flush();
		
		
		
		//wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		//driver.findElement(By.name("username")).sendKeys("Admin");
	}

	public static void passwordEnter(String str) throws Exception {
		
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering password");
		logger1.log(Status.INFO,"Entering the password into the field variable");
		try
		{
			Page1objects.password().sendKeys(str);
			logger1.log(Status.PASS,"Password entered successfully");
		}
		catch(Exception E)
		{
			System.out.println("Password :"+E);
			logger1.log(Status.FAIL,"Error occured in entering the password");
		}
		extent.flush();
		
		
		
		//driver.findElement(By.name("password")).sendKeys("admin123");
	}

   public static void clickLogin() throws Exception {
		
	   extent.attachReporter(reporter);
		logger1=extent.createTest("Click login");
		logger1.log(Status.INFO,"Checking the funtionality of login button");
		try
		{
			Page1objects.login().click();
			logger1.log(Status.PASS, "Login successfull");
		}
		catch(Exception E)
		{
			System.out.println("Click :"+E);
			logger1.log(Status.FAIL, "Login failed");
		}
		extent.flush();
	
	   
	   
	   //driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	public static void expectedTitleCheck() {
	String actualTitle = driver.getTitle();
	String expectedTitle = "OrangeHRM";

	if (actualTitle.equals(expectedTitle)) {
		System.out.println("Title match");
	} else {
		System.out.println("Title does not match");
	}
}
	
	
	public static void enterUsername(String data) {
     try {
			Page1objects.username().sendKeys(data);
		} catch (Exception e) {
          	System.out.println("Page1 - Username");
          }
     }
	public static void enterPassword(String data) {
      try {
			Page1objects.password().sendKeys(data);
		} catch (Exception e) {
        	System.out.println("Page1 - Password");
         }
	}
	public static void enterLogin() {
		try {
			Page1objects.login().click();
		} catch (Exception e) {
			System.out.println("Page1 - Login");
		}
	}
}
