package de.altra.hths.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class HTHSStartScreenController {

	@FXML private PasswordField pwField;
	
	
	
	@FXML
	private void pwSubmit() {
		String pw = pwField.getText();
		if(pw.equals("abc")) System.out.println("correct");
		else System.out.println("false password");
		
	}
}
