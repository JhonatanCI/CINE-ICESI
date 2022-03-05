package control;

import java.io.IOException;

import exceptions.NotValidCC;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.ccRegister;

public class ControllerRegisterCC{

    @FXML
    private Button registerBUT;

    @FXML
    private TextField registerTF;
     
    private String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
    
    public ccRegister data = new ccRegister();

    @FXML
    void RegisterCC(ActionEvent event) {
    	try {
				if (registerTF.getText().length()>11) {
					throw new NotValidCC();
				}
				boolean stringFound = true;
				for(int j = 0; j<registerTF.getText().length();j++) {
					for(int f = 0; f<numbers.length;f++) {
						if((String.valueOf(registerTF.getText().charAt(j)).equals(numbers[f]))&& stringFound) {
							stringFound = false;
						}
					}
				}
				if(stringFound==true) {
					throw new NotValidCC();
				}
			
    		ccRegister.ccs.add(registerTF.getText());
    		data.saveJSON();
    		close();
    		callStart();
    	}catch(NotValidCC ex) {
    		
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void close() {
    	Stage stage = (Stage) registerBUT.getScene().getWindow();
		stage.close();
    }
    
    public void callStart() throws IOException {
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
