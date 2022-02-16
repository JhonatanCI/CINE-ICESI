package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.Main;

public class ControllerMenu {
	@FXML
    private Button funcRegisterBUT;

    @FXML
    private Button registerPersonBUT;

    @FXML
    void RegisterFunction(ActionEvent event) throws Exception{
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RegisterFunction.fxml"));
		loader.setController(new ControllerRegisterFunction());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void RegisterPerson(ActionEvent event) throws Exception {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RegisterPerson.fxml"));
		loader.setController(new ControllerRegisterPerson());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
}
