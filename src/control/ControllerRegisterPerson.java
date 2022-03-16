package control;



import java.io.IOException;

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
import model.Person;


public class ControllerRegisterPerson {
	
	Function f;
    public ControllerRegisterPerson(Function f) {
		this.f = f;
	}

	@FXML
    private TextField idPersonTXF;

    @FXML
    private TextField fullNameTXF;

    @FXML
    private Button okBTN;

    @FXML
    private Button backBTN;
    

    @FXML
    void goBack_table(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/FunctionsTable.fxml"));
		loader.setController(new ControllerFunctionTable());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		close();
    }
    
    @FXML
    void addPerson(ActionEvent event) throws IOException {
    	boolean conti = true;
    	for(int i = 0; i < Bienestar.functions.size()&& conti;i++) {
    		if(Bienestar.functions.get(i)==f) {
    			Person p = new Person(idPersonTXF.getText(), fullNameTXF.getText());
    			if(Bienestar.functions.get(i).addPerson(p)) {
    	        	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/SelectSala.fxml"));
    	    		loader.setController(new ControllerSelectSala(p));
    	    		Parent parent;
    	    		parent = (Parent) loader.load();
    	    		Scene scene = new Scene(parent);
    	    		Stage stage = new Stage();
    	    		stage.setScene(scene);
    	    		stage.show();
    	    		close();
    	    	}else {
    	    		conti = false;
    	    	}
    		}
    	}
    	
    	
    }
    
    public void close() {
		Stage stage = (Stage) okBTN.getScene().getWindow();
		stage.close();
	}

}
