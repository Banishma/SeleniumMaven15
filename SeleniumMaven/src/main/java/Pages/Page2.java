package Pages;
import java.time.Duration;
//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import Browser.Browser;
import Locators.Page1objects;
import Locators.Page2objects;

public class Page2 extends Browser {
	

	public static WebDriverWait wait;
	static Page2objects obi;
	
	
	
	
	public static void menu(String str) {
		
		
		extent.attachReporter(reporter);
		logger1=extent.createTest("Selection of dashboard menu");
		logger1.log(Status.INFO, "Selecting the function from the dashboard");
		
		try{
			List<WebElement> list=Page2objects.menuElements();
			for(WebElement e:list)
			{
				if(e.getText().equalsIgnoreCase(str))
				{	e.click();
					break; }
			}
			logger1.log(Status.PASS,"Dashboard Element selected successfully");
			}
		
		catch(Exception E)
		{
			System.out.println("Click :"+E);
			logger1.log(Status.FAIL,"Selection failed");
		}	
		extent.flush();
	}
	
	public static String MenuName()
	{
		return Page2objects.menuName().getText();
	}
		
		
		
		
		
		//obi = PageFactory.initElements(driver, Page2objects.class);
		//wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(obi.search));
		//try {
		//	for (WebElement e : obi.list) {
		//		if(e.getText().equalsIgnoreCase(str)) {
		//			e.click();
		//			break;
		//		}
		//	}
		//} catch (Exception exc) {
		//	System.out.println(exc);
		//}
		
	
	
	
	
	
	
	
	
	
//	public static WebDriverWait wait;
//	public static void displayMyInfo() throws Exception {
//		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.titleIs("Dashboard"));
//		driver.findElement(By.linkText("My Info")).click();
//	}
	
//	REUSABLE CONCEPT - STATIC
	
	//public static void expectedUserCheck() {
	//WebElement web = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
	//String actualUser = web.getText();
	//String expectedUser = "Giang Ngyuen";	
	//if(actualUser.equals(expectedUser)) {
	//	System.out.println("Username verified");
	//} else {
	//	System.out.println("Username not verified");
	//}
//}
	
	
	
	//public static void optionSelect(WebElement e) {
		//try {
			//e.click();
		//} catch (Exception ex) {
			//System.out.println("Click: " + ex);
		//}
	//}
	
	
//	DYNAMIC SCRIPT
	//public static void optionSelectDynamic() {
	//	List<WebElement> list = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
		//for (int i = 0; i < list.size(); i++) {
	//		if (list.get(i).getText().equalsIgnoreCase("My Info"))
	//	{
		//		list.get(i).click();
	//			break;
	//		}
	//	}
	//}
	
	
	public static void optionClick(String str) {
		try {
			List<WebElement> list = Page2objects.menuElements();
			for(WebElement e: list) {
				if(e.getText().equalsIgnoreCase(str)) {
					e.click();
					break;
				}
			}
		} catch (Exception e) {
		System.out.println("Click: " + e);
		}
	}
	
	
	public static String expectedUserCheck(String str) {
		WebElement web = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
	String actualUser = web.getText();
		String expectedUser = str;
		
		if(actualUser.equals(expectedUser)) {
			System.out.println("Username verified");
		} else {
			System.out.println("Username not verified");
		}
		return expectedUser;
	}
	
	public static String menuName() {
		return Page2objects.menuName().getText();
	}
	
}
