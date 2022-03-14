package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

public class Bienestar {
	
	private Sala miniSala;
	private Sala sala;
	public static ObservableList<Function> functions = FXCollections.observableArrayList();
	
	
	public Bienestar(Sala miniSala, Sala sala) {
		this.miniSala = miniSala;
		this.sala = sala;
	}
	
	public Bienestar() {
		
	}
	
	public static void addfunction(String name, String room,int hourHour,int hourMinutes,int durationHour,int durationMinutes,String day,String month) {
		Function f = new Function(name, room, hourHour, hourMinutes, durationHour, durationMinutes, day, month);
		boolean pass = true;
		for (Function fun : functions) {
			if(f.getName().equalsIgnoreCase(fun.getName())) {
				pass = false;
				Alert alert = new Alert(Alert.AlertType.ERROR);
			    alert.setHeaderText(null);
			    alert.setTitle("Error the function already exist");
			    alert.setContentText("The name is already using please write other name");
			    alert.showAndWait();
			}else {
				if(fun.getDate().getTime()==f.getDate().getTime()&&fun.getroom().equals(f.getroom())&&(fun.getHour().getHour()<=f.getHour().getHour()||
						fun.getHour().calculateFinish(fun.getDuration().getHour())>=f.getHour().calculateFinish(f.getDuration().getHour()))) {
					pass = false;
					Alert alert = new Alert(Alert.AlertType.ERROR);
				    alert.setHeaderText(null);
				    alert.setTitle("Error");
				    alert.setContentText("Exists other function with same hour with that room");
				    alert.showAndWait();
				}
			}
			
		}
		if(pass) {
			functions.add(f);
		}
		
	}
	
	public void saveJSON() {
		Gson gson = new Gson();
		String json = gson.toJson(functions);
		File file = new File("data/dataFun.json");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(json.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public  void loadJSON() {
		FileInputStream is;
		try {
			is = new FileInputStream(new File("data/dataFun.json"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			
			String json = "";
			String line;
			while((line = reader.readLine()) !=null) {
				json += line;
			}
			//String = Obj
			Gson gson = new Gson();
			Function[] data = gson.fromJson(json, Function[].class);
			for(Function d : data)
			functions.add(d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Sala getMiniSala() {
		return miniSala;
	}

	public void setMiniSala(Sala miniSala) {
		this.miniSala = miniSala;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	
	
	
	
	
}
