package control;

import java.util.ArrayList;

import exceptions.NotValidCC;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerRegisterCC {

    @FXML
    private Button registerBUT;

    @FXML
    private TextField registerTF;
    
    private ArrayList<String> cc = new ArrayList<String>(); 

    @FXML
    void RegisterCC(ActionEvent event) {
    	try {
    		for (int i = 0; i<cc.size();i++) {
				if (cc.get(i).length()>10) {
					throw new NotValidCC();
				}
			}
    		cc.add(registerTF.getText());
    	}catch(NotValidCC ex) {
    		
    	}
    }
    
    public ArrayList<String> getArray(){
    	cc.add("1006101922");
    	return cc;
    }

}
