package generics_library;

import org.testng.Assert;

public class ValidationUtil 
{
	
public static void verificationMsg(String expres, String actres,String path, String sheetName,int rowNum,int cellNum)
{
	try
	{
		Assert.assertEquals(actres, expres);
		ExcelUtil.writeData(path, sheetName, rowNum, cellNum,"pass");	
	}
	catch(AssertionError rv)
	{
		ExcelUtil.writeData(path, sheetName, rowNum, cellNum,"fail");
	}
}
}
