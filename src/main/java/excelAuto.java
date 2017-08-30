import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelAuto {

public void excelReader() throws Exception
{
	File  file= new File("D:\\TestData.xlsx");
	
	

    FileInputStream inputStream = new FileInputStream(file);

	XSSFWorkbook xf = new XSSFWorkbook(inputStream);

	XSSFSheet guru99Sheet = xf.getSheet("Sheet1");

    //Find number of rows in excel file

    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = guru99Sheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        }

        System.out.println();

    }
    }
	}	
	
	

