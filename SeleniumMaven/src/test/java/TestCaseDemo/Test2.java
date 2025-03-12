package TestCaseDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser.Browser;
import Excel.logindata;
import Pages.Page1;
import Pages.Page2;

public class Test2 {
	@BeforeMethod
	public void open() throws Exception{
		Browser.init("test2report");
		Browser.openBrowser();
		Browser.navigateToUrl();
	}
	
	@DataProvider(name = "dp1")
	public Object[][] data() throws Exception {
		 Object[][] obj = logindata.readExcel(0);
		 return obj;
	}
	
	@Test (dataProvider = "dp1")
	public void enterCredentials(String name, String pwd, String exp) {
		Page1.enterUsername(name);
		Page1.enterPassword(pwd);
		Page1.enterLogin();
		
		Assert.assertEquals(Page2.menuName(), exp);
		
		Page2.optionClick("My Info");
		if(Page2.menuName().equals(exp)) {
		Assert.assertEquals(Page2.menuName(), exp);
		}
		
		
		Reporter.log("TestCase2 Login Credential Assertion Pass");
	}
	
	@AfterMethod
	public void close() throws Exception{
		Thread.sleep(3000);
		Browser.closeBrowser();
	}

}
