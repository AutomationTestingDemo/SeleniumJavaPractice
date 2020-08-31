package generics_library;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil 
{
	public static String readData(String path, String sheetName, int rowNum, int cellNum)
	{
try
{
	FileInputStream fis = new FileInputStream(path);
	Workbook w1= WorkbookFactory.create(fis);
	Sheet s1 = w1.getSheet(sheetName);
	String data = s1.getRow(rowNum).getCell(cellNum).getStringCellValue();
	return data;
}
catch(Exception rv)
{
	return"";
}
	}
	public static void writeData(String path, String sheetName,int rowNum, int cellNum, String data)
	{
	try
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet(sheetName);
		s1.getRow(rowNum).createCell(cellNum).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(path);
		w1.write(fos);	
	}
	catch(Exception rv)
	{
		
	}
}
}
