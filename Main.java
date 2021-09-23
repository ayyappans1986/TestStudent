package assignment22092021;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import sampleMaven.ExcelRead;

public class Main {

	 XSSFSheet sheet ;
		Main() throws IOException{
					FileInputStream file = new FileInputStream("F:\\Selenium\\Eclipse Workspace\\GitSpace\\demoTest\\details.xlsx");
					XSSFWorkbook workbook = new XSSFWorkbook(file);
					sheet = workbook.getSheet("Sheet1");
					
					Row row = sheet.getRow(0);
					Cell cell = row.getCell(0);
					Cell cellM1 = row.getCell(1);
					Cell cellM2 = row.getCell(2);
					Cell cellM3 = row.getCell(3);
					String name = cell.getStringCellValue();
					Double mark1=cellM1.getNumericCellValue();
					Double mark2=cellM2.getNumericCellValue();
					Double mark3=cellM3.getNumericCellValue();
					
					Student sTU = new Student();
					sTU.setName(name);
					sTU.setmark1(mark1);
					sTU.setmark2(mark2);
					sTU.setmark3(mark3);
					
					TestMark tM = new TestRank();
					tM.calRank(sTU.getName(), sTU.getMark1(), sTU.getMark2(), sTU.getMark3());
		}
		
		public static void main(String args[]) throws IOException{
			Main mN= new Main();
		}
}

					
					
	 				


