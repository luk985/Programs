package WindowCheck;
import java.io.IOException;
import WindowMain.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public String VersionRegister = "ver. 1.0";

	public void start (Stage primaryStage) {

		try {
 			Pane root = (Pane)FXMLLoader.load(getClass().getResource("WindowCheckUsers.fxml"));
			Label LabelPersonStatus = (Label)root.lookup("#personStatus");
			Label LabelVersion = (Label)root.lookup("#version");
			Scene scene = new Scene(root, 307,287);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			LabelVersion.setText(VersionRegister);
			Check check = new Check();
			if (check.CheckPerson().equals("positive")) {
				System.out.println("Verification is positive");
				LabelPersonStatus.setText("Dokonano weryfikacji loginu użytkownika:\n" + check.username + "\nDostęp przyznany");
				WindowMain windowmain = new WindowMain();
				windowmain.start2(primaryStage);
			} else {
				System.out.println("Verification is negative");
				LabelPersonStatus.setText("Dokonano weryfikacji loginu użytkownika:\n" + check.username + "\nUżytkownik nie posiada uprawnień");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {


		launch(args);




	}

}
