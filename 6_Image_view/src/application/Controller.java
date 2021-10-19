package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	int i = 1;
	
	@FXML
	ImageView myImageView;
	Button myButton;
	
	Image myImage;

	public void displayImage() {
		if(i % 2 == 1) {
		myImage = new Image(getClass().getResourceAsStream("/Image/photo2.jpg"));
		myImageView.setImage(myImage);
		} else {
		myImage = new Image(getClass().getResourceAsStream("/Image/photo1.jpg"));
		myImageView.setImage(myImage);	
		}
		i++;
	}
}
