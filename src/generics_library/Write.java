package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("main starts");
		String path="C:/kalyan/data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1 =w1.getSheet("Sheet3");
		for(int j=0;j<=5;j++)
		{
		Row r1=s1.createRow(j);
		System.out.println("enter 5 cell vlaues for:"+j+"row");
		for(int i=0;i<=4;i++){
		Cell c1=r1.createCell(i);
		Scanner s2 = new Scanner(System.in);
		
		c1.setCellValue(s2.next());
		}
		}
		FileOutputStream fop = new FileOutputStream(path);
		w1.write(fop);
		System.out.println("main ends");
		
		
	}

}
