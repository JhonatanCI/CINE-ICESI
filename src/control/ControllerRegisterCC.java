package control;

import exceptions.NotValidCC;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.ccRegister;

public class ControllerRegisterCC {

    @FXML
    private Button registerBUT;

    @FXML
    private TextField registerTF;
     

    @FXML
    void RegisterCC(ActionEvent event) {
    	try {
    		for (int i = 0; i<ccRegister.ccs.size();i++) {
				if (ccRegister.ccs.get(i).length()>10) {
					throw new NotValidCC();
				}
			}
    		ccRegister.ccs.add(registerTF.getText());
    	}catch(NotValidCC ex) {
    		
    	}
    }
    

}
