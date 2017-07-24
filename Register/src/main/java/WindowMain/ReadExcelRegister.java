package WindowMain;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
		
		
		String connectionDatabaseRegister = "jdbc:mysql://127.0.0.1/register";
		String adminRegister = "root";
		String passwordRegister = "";
		
		Connection conn = null;
		
		try {
			
			//Ustawienie danych dotyczących podłączenia
			conn = DriverManager.getConnection(connectionDatabaseRegister, adminRegister, passwordRegister);
			
			//Ustawienie sterownika MySQL
			Class.forName("com.mysql.jdbc.Driver");
			
			//Uruchomienie zapytania do bazy danych
			Statement stmt = conn.createStatement();
			
			
			String endOfTable = "";
			int x =2;
			int y =3;
			int lp=1;
			// Wczytywanie pliku EXCEL w rozszerzeniu xls
			String excelFilePath = "C:/Users/luk/Desktop/Java/Rejestr ofert 2017.xls";
			//String excelFilePath = "C:/Users/luk/Desktop/Data1.xls";
			
			//Definicja nowego strumienia danych
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath)); 
					
			Workbook oldRegister = new HSSFWorkbook(inputStream);
			
			Sheet firstSheet = oldRegister.getSheetAt(0);
			
			do {
				Row row = firstSheet.getRow(x);
				Cell cell = row.getCell(y);
				endOfTable = cell.toString();
				System.out.println(cell.toString());
				//ResultSet rs = stmt.executeQuery("INSERT INTO register (Topic) VALUES ('TEST WPISU');");
				lp++;
				x++;
			} while ( endOfTable.length()>1);
			ResultSet rs = stmt.executeQuery("INSERT INTO register (Topic) VALUES ('Test 4');");
			rs = stmt.executeQuery("SELECT * FROM register;");
			while (rs.next()) {
			System.out.println(rs.getInt("Lp") + ", " + rs.getString("Topic"));
			}
			
			//while(rs.next()) {
			//}
			
			
			
			}  catch(Exception e) {
				e.printStackTrace();
			}
			
		
		

		
		

		
		// Zapis do bazy danych

		
		
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
