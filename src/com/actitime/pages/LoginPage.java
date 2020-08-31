package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics_library.BaseTestScript;

public class LoginPage 
{
@FindBy(name ="username")
private WebElement usernameTextBox;
@FindBy(name ="pwd")
private WebElement passwordTextBox;
@FindBy(xpath ="//input[@type='submit']")
private WebElement loginButton;

public LoginPage()
{
	PageFactory.initElements(BaseTestScript.driver, this);
}
public void enterUsername(String un)
{
	usernameTextBox.sendKeys(un);
}
public void enterPassword(String pwd)
{
	passwordTextBox.sendKeys(pwd);
}
public void clickonLoginButton()
{
	loginButton.click();
}


}
