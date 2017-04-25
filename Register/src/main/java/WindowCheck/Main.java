package WindowCheck;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

	public void start (Stage primaryStage) {
		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("WindowCheckUsers.fxml"));
			Scene scene = new Scene(root, 290,270);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Check Check = new Check();
		launch(args);

		Check.CheckPerson();

	}

}
