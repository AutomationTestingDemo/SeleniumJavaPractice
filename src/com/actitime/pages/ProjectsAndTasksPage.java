package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics_library.BaseTestScript;

public class ProjectsAndTasksPage extends BasePage
{
@FindBy (partialLinkText ="Customers")
private WebElement projectsAndCustomersLink;
public ProjectsAndTasksPage()
{
	PageFactory.initElements(BaseTestScript.driver, this);
}
public void clickonProjectsandCustomersLink()
{
	projectsAndCustomersLink.click();
}
}
