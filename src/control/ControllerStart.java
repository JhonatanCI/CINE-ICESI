package control;

import exceptions.CCNotInTheSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;

public class ControllerStart {

    @FXML
    private TextField ccTF;

    @FXML
    private Button startCCBUT;
    
    private ControllerRegisterCC cc = new ControllerRegisterCC();

    @FXML
    void verifyCC(ActionEvent event) throws Exception {
    	boolean find = false;
    	try {
    		for (int i = 0; i<cc.getArray().size() && !find;i++) {
				if(ccTF.getText().equalsIgnoreCase(cc.getArray().get(i))) {
	    			find = true;
	    			showMenu();
	    		}
			}
    		if(find==false) {
    			throw new CCNotInTheSystem();
    		}
    	}  
    	catch(CCNotInTheSystem ex) {
    		showExceptionWindow(ex);
    	}
    }
    
    public void showMenu() throws Exception{
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Menu.fxml"));
		loader.setController(new ControllerMenu());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
    
    public void showExceptionWindow(Exception ex) throws Exception {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ExceptionWindow.fxml"));
		loader.setController(new ControllerExceptionWindow(ex));
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }

}