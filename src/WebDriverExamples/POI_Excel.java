package WebDriverExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class POI_Excel {
public static void main(String args[]) throws Exception{
	FileInputStream fileinput = new FileInputStream("D:\\Write.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum());
	System.out.println("Before Updating the Cell data" +sheet.getRow(3).getCell(1));
	// Write the data in excel file
    XSSFCell cell =  sheet.getRow(3).getCell(1);
    cell.setCellValue("Test123");
    fileinput.close();
    FileOutputStream fileOut = new FileOutputStream("D:\\Write.xlsx");
    workbook.write(fileOut);
    System.out.println("Updated data after writing " + cell.getStringCellValue());
    fileOut.close();
	}
}
