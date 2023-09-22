package WebDriverExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel {
public static void main(String args[]) throws Exception{
	FileInputStream file = new FileInputStream("D:\\Read.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st = wb.getSheet(0);
	int row = 2;
	String EmpID = st.getCell(0,row).getContents();
	String EmpName = st.getCell(1,row).getContents();
	String Mail = st.getCell(2,row).getContents();
	String Phone = st.getCell(3,row).getContents();
	System.out.println(EmpID+" "+EmpName+" "+Mail+" "+Phone);
}
}
