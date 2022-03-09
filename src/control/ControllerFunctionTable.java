package control;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Function;
import model.FunctionsRegister;
import model.Hour;

public class ControllerFunctionTable implements Initializable{

    @FXML
    private TableView<Function> functionTable;

    @FXML
    private TableColumn<Function, String> nameCOL;

    @FXML
    private TableColumn<Function, String> roomCOL;

    @FXML
    private TableColumn<Function, Date> dateCOL;

    @FXML
    private TableColumn<Function, Hour> HourCOL;

    @FXML
    private TableColumn<Function, Hour> durationCOL;

    @FXML
    private Button returnBUT;

    @FXML
    void close(ActionEvent event) {
    	close();
    }
    public void close() {
		Stage stage = (Stage) functionTable.getScene().getWindow();
		stage.close();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		nameCOL.setCellValueFactory(new PropertyValueFactory<>("name"));
		roomCOL.setCellValueFactory(new PropertyValueFactory<>("room"));
		dateCOL.setCellValueFactory(new PropertyValueFactory<>("date"));
		HourCOL.setCellValueFactory(new PropertyValueFactory<>("hour"));
		durationCOL.setCellValueFactory(new PropertyValueFactory<>("duration"));
		
		functionTable.setItems(FunctionsRegister.functions);
		
		functionTable.setOnMouseClicked(event->{Function stClicked = functionTable.getSelectionModel().getSelectedItem();
			System.out.println(stClicked.getName());
		});
	}

}