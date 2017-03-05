package de.altra.hths;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HTHSMain extends Application {
	
	private static Stage primaryStage; 
	private static Scene scene;

	private static AnchorPane startScreenLayout;	// create borderpane for startscreen
	private static AnchorPane menuScreenLayout;
	
	private static double mousePosx = 0;
	private static double mousePosy = 0;
	 


	@Override
	public void start(Stage stage) {
		
		HTHSMain.primaryStage = stage;
		HTHSMain.primaryStage.setTitle("Testtitel");
		
		HTHSMain.primaryStage.initStyle(StageStyle.UNDECORATED);
		
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
			 
			 startScreenLayout.setOnMousePressed(e -> mousePressed(e));
			 startScreenLayout.setOnMouseDragged(e -> mouseDragged(e));
			 			 
			 primaryStage.setResizable(false);
			 primaryStage.setScene(scene);
			 primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	private static void mouseDragged(MouseEvent e) { // draggs screen around
		HTHSMain.primaryStage.setX((e.getScreenX() - mousePosx));
		HTHSMain.primaryStage.setY((e.getScreenY() - mousePosy));
	}

	private static void mousePressed(MouseEvent e) { 	// gets mousepositions
		mousePosx = e.getSceneX();
		mousePosy = e.getSceneY();
	}
	
	public static void closeStartMenu() { // closes the menu through a button
		HTHSMain.primaryStage.close();		
	}

	
	
	
	
	
	
	
	
	
/*	public static void initMenuScreen() {
		
		try {
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(HTHSMain.class.getResource("layout/MenuScreenLayout.fxml"));
			 startScreenLayout = (AnchorPane) loader.load(); 
			 scene = new Scene(menuScreenLayout);
			 primaryStage.setResizable(false);
			 primaryStage.setScene(scene);
			 primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}*/
}
