
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DataBaseGui extends Application{
		
		private TextField tfFirstName = new TextField();
		private TextField tfLastName = new TextField();
		private TextField tfAddress = new TextField();
		private TextField tfCity = new TextField();
		private TextField tfZipCode = new TextField();
		private TextField tfPhoneNumber = new TextField();
		private ComboBox<Integer> cBCrewSize = new ComboBox<>();
		private TextArea tAComments = new TextArea();

	
	public void start(Stage primaryStage){
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(8);
		gridPane.setVgap(7);
		gridPane.setPadding(new Insets(20, 20, 20, 20));
		gridPane.add(new Label("First Name:"), 0, 0);
		gridPane.add(tfFirstName, 1, 0);
		gridPane.add(new Label("Last Name:"), 0, 2);
		gridPane.add(tfLastName, 1, 2);
		gridPane.add(new Label("Address:"), 0, 4);
		gridPane.add(tfAddress, 1, 4);
		gridPane.add(new Label("City:"), 0, 6);
		gridPane.add(tfCity, 1, 6);
		gridPane.add(new Label("Zip Code:"), 8, 0);
		gridPane.add(tfZipCode, 9 , 0);
		gridPane.add(new Label("Phone Number:"), 8, 2);
		gridPane.add(tfPhoneNumber, 9, 2);
		gridPane.add(new Label("Crew Size:"), 8, 4);
		gridPane.add(cBCrewSize, 9, 4);
		cBCrewSize.getItems().addAll(2,3,4,5,6,7,8,9,10);
		gridPane.add(new Label("Comments:"), 8, 6);
		tAComments.setPrefHeight(100);
		tAComments.setPrefWidth(200);
		gridPane.add(tAComments, 9, 6);


		
		gridPane.setAlignment(Pos.TOP_LEFT);
		
		
		Scene scene = new Scene(gridPane, 620 , 350);
		primaryStage.setTitle("Arthur Perez Moving Database");
		primaryStage.setScene(scene);
		primaryStage.show();	
	
	}
	
	
	public static void main(String[] args) {

	Application.launch();	
		
	}

}
