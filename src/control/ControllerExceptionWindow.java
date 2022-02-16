package control;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ControllerExceptionWindow {
	

    @FXML
    private TextArea textArea;
    
    public ControllerExceptionWindow(Exception ex){
    	
    	textArea.setText("Error, something goes wrong");
    }
	
}
