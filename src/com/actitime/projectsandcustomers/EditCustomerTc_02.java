package com.actitime.projectsandcustomers;

import org.testng.annotations.Test;

import com.actitime.pages.EditCustomerInformationPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndCustomersPage;
import com.actitime.pages.ProjectsAndTasksPage;
import com.actitime.projectspecific_lib.Constants;

import generics_library.BaseTestScript;
import generics_library.ExcelUtil;
import generics_library.ValidationUtil;

public class EditCustomerTc_02 extends BaseTestScript
{
	@Test
	public void editCustomerTc_01()
	{
		String ncn = ExcelUtil.readData(Constants.XL_PATH,"TC_02", 1, 0);
		String expres = ExcelUtil.readData(Constants.XL_PATH,"TC_02", 1, 1);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ProjectsAndCustomersPage pacp = new ProjectsAndCustomersPage();
		EditCustomerInformationPage ecip = new EditCustomerInformationPage();
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickonLoginButton();
		patp.clickonProjectsandCustomersLink();
		pacp.clickonCustomerName("sharmaindia");
		ecip.editCustomerName(ncn);
		ecip.clickonSaveChangesButton();
		String actres = ecip.getSuccessMsg();
		ecip.clickonLogoutButton();
		ExcelUtil.writeData(Constants.XL_PATH, "TC_02", 1, 2, actres);
		ValidationUtil.verificationMsg(expres, actres, Constants.XL_PATH,"TC_02", 1,3);
		
		
	}

}
