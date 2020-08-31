package com.actitime.projectsandcustomers;

import org.testng.annotations.Test;

import com.actitime.pages.EditCustomerInformationPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndCustomersPage;
import com.actitime.pages.ProjectsAndTasksPage;
import com.actitime.projectspecific_lib.Constants;

import generics_library.BaseTestScript;
import generics_library.ExcelUtil;
import generics_library.Utility;
import generics_library.ValidationUtil;

public class DeleteCustomerTC_03 extends BaseTestScript
{
	@Test
	public void deleteCustomerTc_03()
	{
		String expres = ExcelUtil.readData(Constants.XL_PATH, "TC_03", 1,0);
		LoginPage lp= new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ProjectsAndCustomersPage pacp = new ProjectsAndCustomersPage();
		EditCustomerInformationPage ecip = new EditCustomerInformationPage();
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickonLoginButton();
		patp.clickonProjectsandCustomersLink();
		pacp.clickonCustomerName("America");
		Utility.takeScreenShot("deleteCustomerTc_03");
		ecip.clickonDeleteCustomer();
		String text = Utility.getTextAlert();
		System.out.println(text);
		Utility.acceptAlert();
		String actres = pacp.getSuccessMsg();
		pacp.clickonLogoutButton();
		ExcelUtil.writeData(Constants.XL_PATH,"TC_03", 1, 1,actres);
		ValidationUtil.verificationMsg(expres, actres, Constants.XL_PATH,"TC_03", 1,2);
	}

}
