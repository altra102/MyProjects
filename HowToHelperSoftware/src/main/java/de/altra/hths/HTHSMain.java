package de.altra.hths;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HTHSMain extends Application {
	
	private static Stage primaryStage; 
	private static AnchorPane startScreenLayout;  // create borderpane for startscreen
	private static Scene scene; 


	@Override
	public void start(Stage stage) {
		HTHSMain.primaryStage = stage;
		HTHSMain.primaryStage.setTitle("Testtitel");
		
		initStartScreen();
	}

	public static void main(String[] args) {
		
		
		launch(args);
		
	}
	
	public static void initStartScreen() { // initialize start screen with fxmlloader
		
		try {
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(HTHSMain.class.getResource("layout/StartScreenLayout.fxml"));
			 startScreenLayout = (AnchorPane) loader.load(); 
			 scene = new Scene(startScreenLayout);
			 primaryStage.setResizable(false);
			 primaryStage.setScene(scene);
			 primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
