package DataDriverpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriverExample {

	

	//@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		 Logger Log=(Logger) LogManager.getLogger();   
		//access for workbook
     XSSFWorkbook ExecelWBook;
     XSSFSheet Excelsheet;
   //  XSSFRow ;
   //  XSSFCell ;
     //Excel->Workbook->Sheet->Row->Cell
     
     //to create an object for open excel file
     File excelFile=new File("D:\\Automation\\TestDataFile.xlsx");
     // create for object of file INpute Stream to read data from file
    
    	 FileInputStream inputStream=new FileInputStream(excelFile);
	
	     //Excel->Workbook->Sheet->Row->Cell
    	 
       //Create object for xss fworkb to handle xlsx file
		ExecelWBook = new XSSFWorkbook(inputStream);
		//to access sheet
		Excelsheet =ExecelWBook.getSheetAt(0);
		//to get total row count
		int ttlRow=Excelsheet.getLastRowNum()+1;
		//to get total cell no in row
		int ttlCell=Excelsheet.getRow(0).getLastCellNum();
		
		for(int currentrow=0; currentrow<ttlRow; currentrow++)
		{
			for(int currentcell=0; currentcell<ttlCell; currentcell++)
			{
				System.out.print(Excelsheet.getRow(currentrow).getCell(currentcell).toString());
				System.out.print("\t");
			}
			System.out.println();
		}
		ExecelWBook.close();
	}
	}


