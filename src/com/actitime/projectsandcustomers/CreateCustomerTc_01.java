package com.actitime.projectsandcustomers;

import org.testng.annotations.Test;

import com.actitime.pages.AddNewCustomerPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndCustomersPage;
import com.actitime.pages.ProjectsAndTasksPage;
import com.actitime.projectspecific_lib.Constants;

import generics_library.BaseTestScript;
import generics_library.ExcelUtil;
import generics_library.ValidationUtil;

public class CreateCustomerTc_01 extends BaseTestScript

{
@Test
public void createCustomerTc_01()
{
	
	String cn = ExcelUtil.readData(Constants.XL_PATH,"TC_01", 1, 0);
	String expres = ExcelUtil.readData(Constants.XL_PATH, "TC_01", 1, 1);
	LoginPage lp = new LoginPage();
	ProjectsAndTasksPage patp= new ProjectsAndTasksPage();
	ProjectsAndCustomersPage pacp = new ProjectsAndCustomersPage();
	AddNewCustomerPage ancp= new AddNewCustomerPage();
	lp.enterUsername("admin");
	lp.enterPassword("manager");
	lp.clickonLoginButton();
	patp.clickonProjectsandCustomersLink();
	pacp.clickonAddNewCustomerButton();
	ancp.enterCustomerName(cn);
	ancp.clickonCreateCustomerButton();
	String actres= pacp.getSuccessMsg();
	pacp.clickonLogoutButton();
	ExcelUtil.writeData(Constants.XL_PATH,"TC_01", 1, 2, actres);
	ValidationUtil.verificationMsg(expres, actres, Constants.XL_PATH,"TC_01", 1, 3);
	
	
}

}
