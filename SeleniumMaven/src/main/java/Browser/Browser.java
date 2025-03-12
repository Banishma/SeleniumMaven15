package Browser;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	
	public static void init(String reportName) {
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\target\\ExtentReports\\" + reportName + ".html");
        }
	
	/*
	 * Open the browser based on the choice
	 */
	public static void openBrowser() throws Exception {
		
		
		
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				logger1.log(Status.PASS, "Chrome Browser opened Successfully");
			}
				
			else if (choice.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
				logger1.log(Status.PASS, "Edge Browser opened Successfully");
			}
				
			else if (choice.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
				logger1.log(Status.PASS, "Firefox Browser opened Successfully");
			}
				
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Browser - openBrowser");
			logger1.log(Status.FAIL, "Failed, Browser did not open");
		}
		extent.flush();
		
		
		
	
		
		
		//try {
		//	String choice = Utility.properties("browser"); 
		//	if (choice.equalsIgnoreCase("Chrome"))
		//		driver = new ChromeDriver();
		//	else if (choice.equalsIgnoreCase("Edge"))
		//		driver = new EdgeDriver();
		//	else if (choice.equalsIgnoreCase("Firefox"))
		//		driver = new FirefoxDriver();
	//	} catch (Exception e) {
			// e.printStackTrace();
		//	System.out.println("Browser - openBrowser");
	//	}
	}
 
	/*
	 * Pauses the URL of the application
	 */
	public static void navigateToUrl() throws Exception {
		
		
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Navigating URL");
		logger1.log(Status.INFO, "The URL will be Navigated");
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
			driver.manage().window().maximize();
			act = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs("OrangeHRM"));
			logger1.log(Status.PASS, "The URL has been navigated Successfully");
		} catch (Exception e) {
			System.out.println("Browser - geturl");
			logger1.log(Status.FAIL, "The URL is not navigated.");
		}
		extent.flush();
		
		
		
		//try {
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		//	driver.manage().window().maximize();
			//act = new Actions(driver);
			//wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//} catch (Exception e) {
		//	System.out.println("Browser - geturl");
		//}
	}
	/*
	 * Closes the Browser
	 */
	public static void closeBrowser() {
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Closing the Browser");
		logger1.log(Status.INFO, "The Browser will be closed");
		try {
			driver.quit();
			logger1.log(Status.PASS, "The Browser has been closed Successfully");
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
			logger1.log(Status.FAIL, "The Browser is not Closed.");
		}
		extent.flush();
		
		
		
		//try {
		//	driver.quit();
	//	} catch (Exception e) {
	//		System.out.println("Browser - closeBrowser");
	//	}
	}
	
//	04/03/2025 - Title Check (Expected vs Actual)
	public static void expectedTitleCheck() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title match");
		} else {
			System.out.println("Title does not match");
		}
	}
	
}
