package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics_library.BaseTestScript;

public class BasePage 
{
@FindBy(className="logoutImg")
private WebElement logoutButton;
@FindBy(className="successmsg")
private WebElement successMsg;
public BasePage()
{
	PageFactory.initElements(BaseTestScript.driver,this);
}
public void clickonLogoutButton()
{
	logoutButton.click();
}
public String getSuccessMsg()
{
	String text = successMsg.getText();
	return text;
}
}
