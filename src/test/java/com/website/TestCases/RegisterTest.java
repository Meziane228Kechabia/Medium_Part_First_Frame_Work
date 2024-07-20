package com.website.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.WebsiteTestBase.TestBase;
import com.website.Pages.AccountSuccessPage;
//import com.tutorialsNinja.Utilities.Util;
import com.website.Pages.HomePage;
import com.website.Pages.RegisterPage;


public class RegisterTest extends TestBase {
	public RegisterTest() throws Exception {
		super();
	}
	public WebDriver driver;
	public HomePage homePage;
	public RegisterPage registerPage;
	public AccountSuccessPage accountSuccessPage;
		
@BeforeMethod
public void registerSetup() {
	driver = openingApplicationWithAnyBrowser(prop.getProperty("browser"));
	homePage = new HomePage(driver);
	registerPage = homePage.clickOnRegisterLink();	
}
@Test(priority = 1)// this test case will fell because the registration with the same email alreasy exists

public void verifyRegisterWithAllDetails() {
	accountSuccessPage = registerPage.navigatingToAccountSuccessPage(
			prop.getProperty("firstname"),
			prop.getProperty("lastName"),
			prop.getProperty("email"),
			prop.getProperty("password"), 
			prop.getProperty("confirmPassword")
			);
	Assert.assertTrue(accountSuccessPage.validateAccountSuccessCreateMessage());
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
//Should work fine
}
