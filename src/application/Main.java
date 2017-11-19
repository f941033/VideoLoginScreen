package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	Stage stage;

	@Override
	public void start(Stage primaryStage) {
		try {
			this.stage = primaryStage;
			mainWindow();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mainWindow() {
		try {
			//cargar la estructura de la ventana contenida en el archivo fxml
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
			AnchorPane pane = loader.load();
			Scene scene = new Scene(pane);
			scene.getStylesheets().addAll(Main.class.getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
