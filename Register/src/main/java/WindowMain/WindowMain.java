package WindowMain;

import java.io.IOException;

import WindowCheck.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class WindowMain{
	
	// Dane serwera
	public String connectionDatabaseRegister = "jdbc:mysql://127.0.0.1/register";
	public String adminRegister = "root";
	public String passwordRegister = "";
	
	public void start2 (Stage primaryStage) {

		try {
			Pane root2 = (Pane)FXMLLoader.load(getClass().getResource("/WindowMain/WindowMain.fxml"));
			Scene scene2 = new Scene(root2, 1300, 805);
			primaryStage.setScene(scene2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ReadExcelRegister excel = new ReadExcelRegister();
		try {
			excel.ReadExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}	