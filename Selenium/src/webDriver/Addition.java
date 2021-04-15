package webDriver;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Addition {

	public static void main(String[] args) throws BiffException, IOException {
	/*
	 * @Test public void addition(String num1, String num2, String num3, String
	 * num4) { int a= Integer.parseInt(num1); int b = Integer.parseInt(num2); int c
	 * = Integer.parseInt(num3); int d = Integer.parseInt(num4);
	 * 
	 * int result = (a+b+c+d); }
	 */

File file = new File ("C:/Users/Rajkumar/Desktop/Input1.xls");
Workbook wb = Workbook.getWorkbook(file);

Sheet sh= wb.getSheet("Sheet2");

int rows = sh.getRows();
int columns = sh.getColumns();

System.out.println(rows+" "+columns);

String input[][] = new String [rows][columns];
for (int i=0; i<rows; i++) {
	for (int j=0; j<columns; j++) {
		Cell c = sh.getCell(j, i);
		
	}
	
}

}

}



