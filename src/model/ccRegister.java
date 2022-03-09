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

public class ccRegister {
	
	public static ArrayList<String> ccs = new ArrayList<>();
	
	public void saveJSON() {
		Gson gson = new Gson();
		String json = gson.toJson(ccs);
		File file = new File("data/data.json");
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
			is = new FileInputStream(new File("data/data.json"));
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			
			String json = "";
			String line;
			while((line = reader.readLine()) !=null) {
				json += line;
			}
			//String = Obj
			Gson gson = new Gson();
			String[] data = gson.fromJson(json, String[].class);
			for(String d : data)
			ccs.add(d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
