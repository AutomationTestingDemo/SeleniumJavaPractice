package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics_library.BaseTestScript;

public class AddNewCustomerPage extends BasePage
{
@FindBy(name="name")
private WebElement customernameTextBox;
@FindBy(xpath="//input[@type='submit']")
private WebElement createCustomerButton;
public AddNewCustomerPage()
{
	PageFactory.initElements(BaseTestScript.driver, this);
}
public AddNewCustomerPage enterCustomerName(String un)
{
	customernameTextBox.sendKeys(un);
	return this;
}
public void clickonCreateCustomerButton()
{
	createCustomerButton.click();
}
		
}
