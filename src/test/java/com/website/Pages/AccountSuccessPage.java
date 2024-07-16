package com.website.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {
	public WebDriver driver;

@FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[2]/div[1]")
private WebElement yourRegistrationCompletedMessage;

public AccountSuccessPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public boolean validateAccountSuccessCreateMessage() {
	boolean displayStatus = yourRegistrationCompletedMessage.isDisplayed();
	return displayStatus;
}

}
