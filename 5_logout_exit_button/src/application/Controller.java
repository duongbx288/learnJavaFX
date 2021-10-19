package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private Button logoutButton;
	@FXML
	private AnchorPane scenePane;

	Stage stage;

	public void Logout(ActionEvent event) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Log-out");
		alert.setHeaderText("You are about to log out");
		alert.setContentText("Do you want to save before exiting?");

		if (alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) scenePane.getScene().getWindow();
			System.out.println("You successfully logout");
			stage.close();
		}
	}
}
