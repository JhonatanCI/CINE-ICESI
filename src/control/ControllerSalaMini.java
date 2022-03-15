package control;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import model.Bienestar;

public class ControllerSalaMini implements Initializable {
	
	@FXML
    private Circle a1;

    @FXML
    private Circle a2;

    @FXML
    private Circle a3;

    @FXML
    private Circle a4;

    @FXML
    private Circle a5;

    @FXML
    private Circle a6;

    @FXML
    private Circle a7;

    @FXML
    private Circle b2;

    @FXML
    private Circle b1;

    @FXML
    private Circle b3;

    @FXML
    private Circle b4;

    @FXML
    private Circle b5;

    @FXML
    private Circle c1;

    @FXML
    private Circle b6;

    @FXML
    private Circle b7;

    @FXML
    private Circle d7;

    @FXML
    private Circle d6;

    @FXML
    private Circle d5;

    @FXML
    private Circle d4;

    @FXML
    private Circle d3;

    @FXML
    private Circle d2;

    @FXML
    private Circle d1;

    @FXML
    private Circle c7;

    @FXML
    private Circle c6;

    @FXML
    private Circle c5;

    @FXML
    private Circle c2;

    @FXML
    private Circle c3;

    @FXML
    private Circle c4;

    static ArrayList<String> selectedSeats;
    
    private Bienestar bienestar;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	bienestar = new Bienestar();
    }
    
    
    public void changeColorA1() {
    a1.setOnMouseClicked(e -> { 
        a1.setFill(Color.BLUE);
    });
    
    }
    
    public void changeColorA2() {
    a2.setOnMouseClicked(e -> { 
        a2.setFill(Color.BLUE);
    });
    }
    
    public void changeColorA3() {
    a3.setOnMouseClicked(e -> { 
        a3.setFill(Color.BLUE);
    });
    }
    public void changeColorA4() {
    a4.setOnMouseClicked(e -> { 
        a4.setFill(Color.BLUE);
    });
    }
    
    public void changeColorA5() {
    a5.setOnMouseClicked(e -> { 
        a5.setFill(Color.BLUE);
    });
    }
    
    public void changeColorA6() {
    a6.setOnMouseClicked(e -> { 
        a6.setFill(Color.BLUE);
    });
    }
    
    public void changeColorA7() {
    a7.setOnMouseClicked(e -> { 
        a7.setFill(Color.BLUE);
    });
    }
    
    public void changeColorB1() {
    b1.setOnMouseClicked(e -> { 
        b1.setFill(Color.BLUE);
    });
    }
    
    public void changeColorB2() {
    b2.setOnMouseClicked(e -> { 
        b2.setFill(Color.BLUE);
    });
    }
    
    public void changeColorB3() {
    b3.setOnMouseClicked(e -> { 
        b3.setFill(Color.BLUE);
    });
    }
    
    public void changeColorB4() {
    b4.setOnMouseClicked(e -> { 
        b4.setFill(Color.BLUE);
    });
    }
    
    public void changeColorB5() {
    b5.setOnMouseClicked(e -> { 
        b5.setFill(Color.BLUE);
    });
    }
    
    public void changeColorB6() {
    b6.setOnMouseClicked(e -> { 
        b6.setFill(Color.BLUE);
    });
    }
    
    public void changeColorB7() {
    b7.setOnMouseClicked(e -> { 
        b7.setFill(Color.BLUE);
    });
    }

}
