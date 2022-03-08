package model;

import java.util.ArrayList;

import javafx.scene.control.Alert;

public class FunctionsRegister {
	private static ArrayList<Function> functions = new ArrayList<Function>();
	
	public static void addfunction(Function fun) {
		for ( Function i : functions) {
			if(i.getName().equalsIgnoreCase(fun.getName())) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
			    alert.setHeaderText(null);
			    alert.setTitle("Error the function already exist");
			    alert.setContentText("The name is already using please write other name");
			    alert.showAndWait();
			}
			
		}
		functions.add(fun);
	}
}
