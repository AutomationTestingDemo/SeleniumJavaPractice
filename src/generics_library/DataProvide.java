package generics_library;

import java.io.File;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	
	
	@Test (dataProvider ="Data")
	
	public void dataValidator(String Name, String Place){
		
		
		if((Name!=null)&&(Place!=null)){
		
		System.out.println(Name);
		System.out.println(Place);
		
		}
	}

	@DataProvider(name = "Data")
	public Object[][] dataPass() throws Exception
	
	{
		OPCPackage pkg = OPCPackage.open(new File("C:/Users/Kalyan.c/Desktop/Data.xlsx"));
		XSSFWorkbook w = new XSSFWorkbook(pkg);
		XSSFSheet s = w.getSheet("Sheet1");
		
		XSSFRow r = s.getRow(0);
		
		int row = s.getPhysicalNumberOfRows();
		System.out.println(row);
	    int cell= r.getLastCellNum();
		String[][] dataArray = new String [row][cell];
		
		for(int i=1;i<row;i++){
			
			cell = s.getRow(i).getLastCellNum();
			
			for(int k=0;k<=cell-1;k++){
				
				dataArray[i][k] = s.getRow(i).getCell(k).getStringCellValue();
				
				System.out.println("Check:  "+dataArray[i][k]);
				
			}
		}
		
		return dataArray;
	}
}
