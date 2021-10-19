package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField myTextField;
	@FXML
	private Button myButton;
	@FXML
	private Label myLabel;
	
	int age;
	
	public void submit(ActionEvent event) {
		try {
		age = Integer.parseInt(myTextField.getText());	
		System.out.println(age);
		if (age > 18) {
			myLabel.setText("You are ready!");
		} else {
			myLabel.setText("Beware of your AGE!");
		}
		
		} catch(NumberFormatException e) {
			myLabel.setText("ENTER NUMBER");
		} catch (Exception e) {
			myLabel.setText("Please enter your age.");
			System.out.println("\n"+e);
		}
	}
}
