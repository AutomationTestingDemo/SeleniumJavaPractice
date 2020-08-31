package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics_library.BaseTestScript;

public class EditCustomerInformationPage extends BasePage
{
@FindBy(name="name")
private WebElement customerName;
@FindBy(xpath="//input[@value='Delete This Customer']")
private WebElement deleteCustomer;
@FindBy(name="saveChanges")
private WebElement saveChangesButton;
public EditCustomerInformationPage()
{
	PageFactory.initElements(BaseTestScript.driver,this);
}
public EditCustomerInformationPage editCustomerName(String un)
{
	customerName.clear();
	customerName.sendKeys(un);
	return this;
}
public void clickonSaveChangesButton()
{
	saveChangesButton.click();
}
public void clickonDeleteCustomer()
{
	deleteCustomer.click();
}
}
