package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	//value of the Main.fxml file will be injected to this Controller class
	@FXML
	
	private Circle myCircle;
	private double x;
	private double y;
	
	public void up(ActionEvent e) {
		System.out.println("Up");
		myCircle.setCenterY(y-=1);
	}
	
	public void down(ActionEvent e) {
		System.out.println("Down");
		myCircle.setCenterY(y+=1);
	}
	
	public void left(ActionEvent e) {
		System.out.println("Left");
		myCircle.setCenterX(x-=1);
	}
	
	public void right(ActionEvent e) {
		System.out.println("Right");
		myCircle.setCenterX(x+=1);

	}
}
