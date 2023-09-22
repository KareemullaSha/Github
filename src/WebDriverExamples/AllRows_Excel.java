package WebDriverExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class AllRows_Excel {
public static void main(String args[]) throws Exception{
	FileInputStream file = new FileInputStream("D:\\Read.xls");
	Workbook book = Workbook.getWorkbook(file);
	Sheet s = book.getSheet(0);
	int rowcount = s.getRows();
	System.out.println("Rowcount is" +" "+ rowcount);
	for(int i=1;i<rowcount;i++) {
		String EmpID = s.getCell(0,i).getContents();
		String EmpName = s.getCell(1,i).getContents();
		String Mail = s.getCell(2,i).getContents();
		String Phone = s.getCell(3,i).getContents();
		System.out.println(EmpID+" "+EmpName+" "+Mail+" "+Phone);
	}
}
}
