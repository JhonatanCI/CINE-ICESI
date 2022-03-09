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
import model.Function;
import model.FunctionsRegister;

public class ControllerRegisterFunction {

    @FXML
    private TextField nameTF;

    @FXML
    private TextField dayTF;

    @FXML
    private TextField hourHourTF;

    @FXML
    private TextField durationHourTF;

    @FXML
    private TextField roomFT;

    @FXML
    private TextField monthTF;

    @FXML
    private TextField hourMinutesTF;

    @FXML
    private TextField durationMinutesTF;
    
    @FXML
    private Button registerBUT;
    
    

    @FXML
    void registerFunction(ActionEvent event) throws IOException {
    	try{
    		TextField[] nulls = {nameTF,dayTF,hourHourTF,durationHourTF,roomFT,monthTF,hourMinutesTF,durationMinutesTF};
    		for (int i=0;i<nulls.length;i++) {
				if(nulls[i].getText().equals("")) {
					throw new MissingInformation();
				}
			}
    		int hourStart = Integer.parseInt(hourHourTF.getText());
    		int hourMinutes = Integer.parseInt(hourMinutesTF.getText());
    		int durationHour = Integer.parseInt(durationHourTF.getText());
    		int durationMinutes = Integer.parseInt(durationMinutesTF.getText());
   
    		FunctionsRegister.addfunction(new Function(nameTF.getText(),roomFT.getText(),hourStart,hourMinutes,durationHour,durationMinutes,dayTF.getText(),monthTF.getText()));
    		new FunctionsRegister().saveJSON();
    		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Menu.fxml"));
    		loader.setController(new ControllerMenu());
    		Parent parent = (Parent) loader.load();
    		Scene scene = new Scene(parent);
    		Stage stage = new Stage();
    		stage.setScene(scene);
    		stage.show();
    		close();
    	}catch(MissingInformation ex) {
    		Alert alert = new Alert(Alert.AlertType.WARNING);
		    alert.setHeaderText(null);
		    alert.setTitle("Some camps need to be especify");
		    alert.setContentText("Please write all the spaces");
		    alert.showAndWait();
    	}
    }
    
    public void close() {
		Stage stage = (Stage) registerBUT.getScene().getWindow();
		stage.close();
	}

}

