package generics_library;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read {
	public static void main(String[] args)throws Exception
	{
		String path ="C:/kalyan/data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1= w1.getSheet("sheet2");
		for(int i=0;i<=s1.getLastRowNum();i++)
		{
			for(int j=0;j<=s1.getRow(i).getLastCellNum()-1;j++)
			{
			String data = s1.getRow(i).getCell(j).getStringCellValue();
			System.out.print(data);
			}
		}
		
	}

}
