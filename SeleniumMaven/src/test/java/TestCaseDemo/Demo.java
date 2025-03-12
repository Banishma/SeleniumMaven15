package TestCaseDemo;
import Browser.Browser;
import Pages.Page1;
import Pages.Page2;
import ScreenShot.Capture;
public class Demo {
	
public static void main(String[] args) {
		
			try {
				Browser.openBrowser();
				Browser.navigateToUrl();

//				Browser.closeBrowser();				
//				Page1.usernameEnter();
//				Page1.passwordEnter();
//				Page1.clickLogin();
				
				Thread.sleep(2000);
//				Page2.optionSelect(Browser.driver.findElement(By.linkText("My Info")));
//				Page2.optionSelectDynamic();
				
//				USING LOCATORS - PAGE 1 AND PAGE 2 OBJECTS
				
				//Page1.enterUsername("Admin");
				//Page1.enterPassword("admin123");
				//Page1.enterLogin();
				Thread.sleep(2000);
				Capture.screenShot("title2");
				//Page2.optionClick("My Info");
				Page1.enterLoginCredentials("Admin", "admin123");
				Page2.menu("My Info");
				
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}
}
