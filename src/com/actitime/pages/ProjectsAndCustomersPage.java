package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics_library.BaseTestScript;

public class ProjectsAndCustomersPage extends BasePage
{
@FindBy(xpath="//input[@value='Add New Customer']")
private WebElement addNewCustomerButton;

public ProjectsAndCustomersPage()
{
	PageFactory.initElements(BaseTestScript.driver, this);
}

public void clickonAddNewCustomerButton()
{
	addNewCustomerButton.click();
}
public void clickonCustomerName(String un)
{
	BaseTestScript.driver.findElement(By.linkText(un)).click();
	
	}
}

