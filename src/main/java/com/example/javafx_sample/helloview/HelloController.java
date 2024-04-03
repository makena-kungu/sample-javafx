package com.example.javafx_sample.helloview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
	public HBox appbar;
	public AnchorPane helloViewRoot;
	public TextField searchField;
	public HBox searchBackground;
	@FXML
	private Label welcomeText;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		searchField.setFocusTraversable(false);
	}

	@FXML
	private void handleTextField(ActionEvent event) {
		System.out.println("Change focus!");
		searchBackground.requestFocus();
	}

	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("Welcome to JavaFX Application!");
	}

	public void setText(String text) {
//        welcomeText.setText(text);
	}
}