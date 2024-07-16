package com.website.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public WebDriver driver;

	@FindBy(id = "FirstName")
	private WebElement firstNameField;

	@FindBy (id ="LastName")
	private WebElement lastNameField;

	@FindBy (id = "Email")
	private WebElement emailField;

	@FindBy(id ="Password")
	private WebElement passwordField;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordField;
	
	@FindBy  (id = "register-button")
	private WebElement registerButton;


public RegisterPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void enterFirstName(String firstNameText) {
	firstNameField.sendKeys(firstNameText);
}
public void enterLastName(String lastNametext) {
	lastNameField.sendKeys(lastNametext);
}
public void enterEmail(String emailText) {
	emailField.sendKeys(emailText);
}
public void enterPassword(String passwordText) {
	passwordField.sendKeys(passwordText);
}
public void confirmPassword(String confirmPasswordText) {
	confirmPasswordField.sendKeys(confirmPasswordText);
}
public void clickOnRegisterButton() {
	registerButton.click();
}	 
public AccountSuccessPage navigatingToAccountSuccessPage (String firstNameText, String lastNametext, String emailText, 
		String passwordText, String confirmPasswordText) {
	firstNameField.sendKeys(firstNameText);
	lastNameField.sendKeys(lastNametext);
	emailField.sendKeys(emailText);
	passwordField.sendKeys(passwordText);
	confirmPasswordField.sendKeys(confirmPasswordText);	
	return new AccountSuccessPage(driver);
}
}




