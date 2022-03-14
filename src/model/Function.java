package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;

import javafx.scene.control.Alert;

public class Function {
	private String name;
	private  String room;
    private Date date;
    private Hour hour;
    private Hour duration;
    public ArrayList<Person> persons = new ArrayList<>();
    
    public Function(String name, String room,int hourHour,int hourMinutes,int durationHour,int durationMinutes,String day,String month) {
    	this.name = name;
    	this.room = room;
    	persons = new ArrayList<Person>();
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    	try {
			this.date = sdf.parse(day+"-"+month+"-2022");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	this.hour = new Hour(hourHour, hourMinutes);
    	this.duration = new Hour(durationHour,durationMinutes);
    }
    
    
    public void addPerson(String id, String fullName) {
    	Person p = new Person(id, fullName);
    	persons.add(p);
    	boolean pass = true;
    	try {
		for (int i = 0; i < persons.size();i++) {
			if(persons.get(i).getId().equalsIgnoreCase(p.getId())) {
				pass = false;
				Alert alert = new Alert(Alert.AlertType.ERROR);
			    alert.setHeaderText(null);
			    alert.setTitle("Error the user already exist");
			    alert.showAndWait();
			}else {
				persons.add(p);
				}
			}}catch(NullPointerException ex) {
				ex.printStackTrace();
			}
    }
    
    public void saveJSON() {
		Gson gson = new Gson();
		String json = gson.toJson(persons);
		File file = new File("data/dataPer.json");
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
			is = new FileInputStream(new File("data/dataPer.json"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			
			String json = "";
			String line;
			while((line = reader.readLine()) !=null) {
				json += line;
			}
			//String = Obj
			Gson gson = new Gson();
			Person[] data = gson.fromJson(json, Person[].class);
			for(Person d : data)
			persons.add(d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    public String getName() {
    	return name;
    }
    public String getroom() {
    	return room;
    }
    public Date getDate() {
    	return date;
    }
    
    public Hour getHour() {
    	return hour;
    }
    
    public Hour getDuration() {
    	return duration;
    }
}
