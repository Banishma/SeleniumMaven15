package TestCaseDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.Browser;
import Pages.Page1;
import Pages.Page2;

public class Test3 {
	@BeforeMethod
    public void openbrowser() throws Exception{
		Browser.init("test3report");
    Browser.openBrowser();
    Browser.navigateToUrl();
     }

	@Test
     public void TestMenu(){

	Page1.enterUsername("Admin");
    Page1.enterPassword("admin123");
    Page1.enterLogin();;
    Page2.optionClick("leave");
	}

	@AfterMethod

	public void closebrowser(){
    Browser.closeBrowser();

	}
}
