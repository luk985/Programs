package WindowCheck;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
	protected Label personStatus;
	
	@FXML
	protected Button buttonOne;
	
	 @FXML
	protected void PersonTestFail() {
		personStatus.setText("Dostęp zabroniony - brak uprawnień");
		}
	 
	 @FXML
	 public void PersonTestSuccess() {
		personStatus.setText("test");
	 }
	 
	 @FXML
	 public void Test() {
		System.out.println("Window - test");
	 }
	 
	 @FXML
	 public void clickbutton(ActionEvent event) {
		 personStatus.setText("test");
	 }
	
}