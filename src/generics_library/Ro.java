package pack1;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ro {
	public static void main(String[] args)throws Exception
	{
		String path ="C:/kalyan/data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1= w1.getSheet("sheet2");
		Row r1 =s1.getRow(0);
		for(int i=0;i<=r1.getLastCellNum()-1;i++)
		{
			String data = r1.getCell(i).getStringCellValue();
			System.out.println(data);
			
		}
		
	}

}
