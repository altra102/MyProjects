package de.altra.hths.controller;

import de.altra.hths.HTHSMain;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class HTHSStartScreenController {

	@FXML private PasswordField pwField;
	
	
	
	@FXML
	private void pwSubmit() { // checks password
		String pw = pwField.getText();
		if(pw.equals("123")) System.out.println("richtig");
		else System.out.println("false password");
		
	}
	
	@FXML
	private void closeStartMenu() { // close function
		HTHSMain.closeStartMenu();	
	}
}
