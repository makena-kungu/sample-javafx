package com.example.javafx_sample;

import com.example.javafx_sample.helloview.HelloController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.MessageFormat;

public class HelloApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {

		final var fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
		final var screen = Screen.getPrimary();
		final var bounds = screen.getBounds();
		final var visualBounds = screen.getVisualBounds();
		final var scene = new Scene(fxmlLoader.load(), bounds.getMaxX() * .95, bounds.getMaxY() * .9);
		final var controller = (HelloController) fxmlLoader.getController();
		controller.setText(MessageFormat.format("Bounds: {0}\nVisual Bounds: {1}", bounds, visualBounds));
		stage.setTitle("Hello!");

		stage.getIcons().add(new Image("/home_48.png"));
		stage.setFullScreenExitHint("Minimise?");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}