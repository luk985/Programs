package WindowMain;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelRegister {
	
	public void ReadExcel() throws IOException {
		

			
		//String excelFilePath = "C:/Users/luk/Desktop/Java/Rejestr ofert 2017.xls";
		String excelFilePath = "C:/Users/luk/Desktop/Data1.xls";
		
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath)); //Definicja nowego strumienia danych
		
		
		Workbook oldRegister = new HSSFWorkbook(inputStream);
		
		Sheet firstSheet = oldRegister.getSheetAt(0);
		
		Row row = firstSheet.getRow(0);
		Cell cell = row.getCell(1);
		
		System.out.println(cell.toString());
		
		
		
		
		
	/*
		String excelFilePath = "C:/Users/luk/Desktop/Data1.xls";
	
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		
		Workbook workbook = new HSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();
		
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;	
				}
				System.out.print(" - ");
			}
			System.out.println();
		}
		workbook.close();
		inputStream.close();
	*/
	}
	

}
