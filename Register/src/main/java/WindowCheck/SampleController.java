package WindowCheck;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
	
	String checkStatus;
	
	@FXML
	public Label personStatus;
	
	@FXML
	public Button buttonOne;
	
	 @FXML
	public void PersonTestFail() {
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
			Check Check = new Check();
			checkStatus = Check.CheckPerson();
			if (checkStatus.equals("false")) {
				personStatus.setText("Dokonano weryfikacji loginu użytkownika: \nUżytkownik nie posiada uprawnień");
				buttonOne.setDisable(true);
			}				
			else {
				personStatus.setText("Dokonano weryfikacji loginu użytkownika: \n" + checkStatus + "\nDostęp przyznany");
			}
			
		 //personStatus.setText("test");
	 }
	
}