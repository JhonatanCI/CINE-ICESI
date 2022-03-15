package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.Main;

public class ControllerSelectSala {

  

	@FXML
    private Button miniSalaBTN;

    @FXML
    private Button salaBTN;

    @FXML
    private Button backBTN;

    @FXML
    void goBack_RP(ActionEvent event)throws Exception {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Menu.fxml"));
		loader.setController(new ControllerMenu());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		close();
    }

    @FXML
    void goSala(ActionEvent event)throws Exception {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/SalaNormal.fxml"));
		loader.setController(new ControllerSalaNormal());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		close();
    }

    @FXML
    void goSalaMini(ActionEvent event)throws Exception {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MiniSala.fxml"));
		loader.setController(new ControllerSalaMini());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stagemini = new Stage();
		stagemini.setScene(scene);
		stagemini.show();
		close();
    }
    
    public void close() {
    	Stage stage = (Stage)salaBTN.getScene().getWindow();
		stage.close();
    }

}
