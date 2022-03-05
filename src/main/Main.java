package main;

import control.ControllerStart;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ccRegister;

public class Main extends Application{
	
	public ccRegister data = new ccRegister();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			data.loadJSON();
			ccRegister.ccs.add("1006101922");
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Start.fxml"));
			loader.setController(new ControllerStart());
			Parent parent = (Parent) loader.load();
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		}

}
