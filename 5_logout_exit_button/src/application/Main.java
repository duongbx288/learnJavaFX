package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			stage.setOnCloseRequest(event -> {
				event.consume(); //prevent program closing when choosing 'Cancel' instead of 'Ok'
				Logout(stage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Show alert when click the exit button (the 'x' button on the top-right of the window
	public void Logout(Stage stage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Log-out");
		alert.setHeaderText("You are about to log out");
		alert.setContentText("Do you want to save before exiting?");

		if (alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("You successfully logout");
			stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
