package control;



import exceptions.MissingInformation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.Bienestar;
import model.Function;


public class ControllerRegisterPerson {

    @FXML
    private TextField idPersonTXF;

    @FXML
    private TextField fullNameTXF;

    @FXML
    private Button okBTN;

    @FXML
    private Button backBTN;

    private Bienestar bienestar;
    

    @FXML
    void goBack_table(ActionEvent event) {
    	
    }
    
    @FXML
    void addPerson(ActionEvent event) {
    	bienestar = new Bienestar();
    	for(int i = 0; i < Bienestar.functions.size();i++) {
    		bienestar.functions.get(i).addPerson(idPersonTXF.getText(), fullNameTXF.getText());
    	}
    	close();
    	
    }
    
    public void close() {
		Stage stage = (Stage) okBTN.getScene().getWindow();
		stage.close();
	}

}
