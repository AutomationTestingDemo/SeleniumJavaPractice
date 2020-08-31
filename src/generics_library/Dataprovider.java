package generics_library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test (dataProvider ="data")
	public void getdata(String name, String place) {
		System.out.println(name);
		System.out.println(place);

	}
	
	
    @DataProvider(name="data")
	public Object[][] provider() throws IOException{
		
		
		File f1 = new File("./TestData/userData.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		@SuppressWarnings("resource")
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet s = w.getSheet("Dataprovider");
		XSSFRow row= s.getRow(0);
		
		int rowNum= s.getLastRowNum();
		int cellNum =row.getLastCellNum();
		
		Object data[][]= new Object[rowNum][cellNum];
		for(int i=1;i<rowNum;i++){
			
			for(int j=0;j<s.getRow(i).getLastCellNum()-1;j++){
				
				
				if(row==null)
					data[i][j]="";
				
				else{
					
					XSSFCell cell =s.getRow(i).getCell(j);
					
					if(cell==null){
						
						data[i][j]="";
					}
					else
					{
						
						String value =cell.getStringCellValue();
						data[i][j]=value;
					}
						
				}
			}
		}
		
		return data;
		
	}
}
